import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Table;

import java.sql.*;

public class JDBCWriter {

    private Connection connection = null;

    public boolean setConnection(){
        final String url ="jdbc:mysql://localhost:3306/rssfeed?serverTimeZone=UTC";
        boolean res = false;
        try{
            connection = DriverManager.getConnection(url,"Fumio","K53x5nj#");
            res = true;
        } catch (SQLException ioerr){
            System.out.println("Vi fik IKKE forbindelse err="+ioerr);
        }
        return res;
    }

    public int countCustomers(){
        String countstr ="select count(*) from customers";
        PreparedStatement preparedStatement;
        int res = -1;
        try{
            preparedStatement = connection.prepareStatement(countstr);
            ResultSet resset = preparedStatement.executeQuery();
            if(resset.next()) {
                String str = "" + resset.getObject(1);
                res = Integer.parseInt(str);
            }
        }catch (SQLException err){
            System.out.println("FEJL i count = "+ err.getMessage());
        }
        return res;
    }

    public int writeFeed(RSSUrl rssUrl, Feed feed){
        String insstr = "INSERT INTO feeds(feedID, feedurl, title, link, description, " +
                "language, copyright, pubDate) value (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement;
        int rowcount = 0;
        try{
            preparedStatement = connection.prepareStatement(insstr);
            preparedStatement.setInt(1, rssUrl.getId());
            preparedStatement.setString(2, rssUrl.getRssurl());
            preparedStatement.setString(3,feed.title);
            preparedStatement.setString(4, feed.getLink());
            preparedStatement.setString(5, feed.getDescription());
            preparedStatement.setString(6, feed.getLanguage());
            preparedStatement.setString(7, feed.getCopyright());
            preparedStatement.setString(8, feed.getPubDate());

            int ii = preparedStatement.executeUpdate();

            rowcount+= ii;
        }catch (SQLException err){
            System.out.println("SQL fejl i writeFeed = "+err.getMessage());
        }
        System.out.println("Færdig med skriv feed");
        return rowcount;
    }

    public int writeMessages(RSSUrl rssUrl, FeedMessage feedMessage){
        String insstr = "INSERT INTO feedmessages(feedid, title, description, guid, link, author) value (?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement;
        int rowcount = 0;
        try{
            preparedStatement = connection.prepareStatement(insstr);
            preparedStatement.setInt(1, rssUrl.getId());
            preparedStatement.setString(2, feedMessage.getTitle());
            preparedStatement.setString(3,feedMessage.getDescription());
            preparedStatement.setString(4, feedMessage.getGuid());
            preparedStatement.setString(5,feedMessage.getLink());
            preparedStatement.setString(6,feedMessage.getAuthor());

            int ii = preparedStatement.executeUpdate();

            rowcount+= ii;
        }catch (SQLException err){
            System.out.println("SQL fejl i writeMessage = "+err.getMessage());
        }
        System.out.println("Færdig med skriv Message");
        return rowcount;
    }

    public int countTable(String tableName){
        String countstr = "Select count(*) from "+ tableName;
        PreparedStatement preparedStatement;
        int res = -1;
        try{
            preparedStatement = connection.prepareStatement(countstr);
            ResultSet resset = preparedStatement.executeQuery();
            if(resset.next()){
                String s = ""+resset.getObject(1);
                res = Integer.parseInt(s);
            }
        }catch (SQLException e){
            System.out.println("SQL fejl i count "+ tableName+" "+ e.getMessage());
        }
        return res;
    }

}
