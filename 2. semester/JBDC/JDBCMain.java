import java.util.ArrayList;

public class JDBCMain {
    public static void main(String[] args) {
        JDBCWriter jdbcWriter = new JDBCWriter();

        boolean hasCon= jdbcWriter.setConnection();
        System.out.println("Vi fik res="+hasCon);

        int count = jdbcWriter.countCustomers();
        System.out.println("test = " + count);

        ArrayList<RSSUrl> news = RSSUrl.getnews();

        if(hasCon){
            for(RSSUrl rssurl: news){;
                String url = rssurl.getRssurl();
                System.out.println(url);
                RSSFeedParser parser = new RSSFeedParser(url);
                Feed feed = parser.readFeed();
                System.out.println(feed);

                jdbcWriter.writeFeed(rssurl, feed);

                for(FeedMessage msg: feed.getMessages()){
                    System.out.println(msg);
                    jdbcWriter.writeMessages(rssurl,msg);
                }
            }
        }
    }
}
