import java.util.ArrayList;

public abstract class HTMLStyle extends HTMLTag{
  private String color;
  public static ArrayList<String> colors;

  public HTMLStyle(String id, String text) {
    super(id, text);
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("yellow");
    colors.add("blue");
    colors.add("green");
    colors.add("lime");
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String toStyleString(){
    return "Style = " + '"'+"Color:"+this.getColor()+'"';}
}
