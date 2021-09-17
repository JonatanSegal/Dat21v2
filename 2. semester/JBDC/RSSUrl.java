import java.util.ArrayList;

public class RSSUrl {
    private int id;
    private String rssurl;

    public static ArrayList<RSSUrl> getnews(){
        ArrayList<RSSUrl> rss = new ArrayList<>();
        rss.add(new RSSUrl(1,"https://ekstrabladet.dk/rssfeed/kendte/"));
        rss.add(new RSSUrl(2,"https://ekstrabladet.dk/rssfeed/kendte/"));
        return rss;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRssurl() {
        return rssurl;
    }

    public void setRssurl(String rssurl) {
        this.rssurl = rssurl;
    }

    public RSSUrl(int id, String rssurl) {
        this.id = id;
        this.rssurl = rssurl;
    }



}
