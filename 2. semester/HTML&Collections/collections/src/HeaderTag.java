public class HeaderTag extends HTMLTag{

  private int number;

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  @Override
  String toHTMLString() {
    return "<"+"</number>";
  }
}
