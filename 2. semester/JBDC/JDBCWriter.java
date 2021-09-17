import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class JDBCWriter {

    private Connection connection = null;

    public boolean setConnection(){
        final String url ="jdbc:mysql://localhost:3306/cinemaerik?serverTimeZone=UTC";
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

}
