public class HeaderTag extends HTMLStyle{

  private int number;


  public HeaderTag(String id, String text, int number) {
    super(id, text);
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

 public void setNumber(int number) {
    this.number = number;
  }


  @Override
  String toHTMLString() {
    return "<h"+getNumber()+" id ="+'"'+ getId()+'"'+" "+this.toStyleString()+"> "+getText() +" </h" +getNumber()+">";
  }

  @Override
  void print() {
    System.out.println(this.toHTMLString());
  }
}
