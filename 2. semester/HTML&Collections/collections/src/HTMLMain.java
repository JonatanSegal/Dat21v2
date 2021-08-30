import java.util.ArrayList;
import java.util.Iterator;

public class HTMLMain {
  public static void main(String[] args) {

    PTag pt1 = new PTag("p1","Jeg er en p1 tag");
    PTag pt2 = new PTag("p2","Jeg er en p2 tag");

    ArrayList<HTMLTag> lst = new ArrayList<>();

    lst.add(pt1);
    lst.add(pt2);
    int ix = lst.indexOf(pt1);

    System.out.println(ix);

    PTag pt3 = new PTag("p1","Jeg er en p1 tag");
    ix = lst.indexOf(pt3);

    System.out.println(ix);

    boolean b = lst.contains(pt3);
    System.out.println(b);

    System.out.println("Size = " + lst.size());
    lst.remove(pt3);
    System.out.println("Size = " + lst.size());

    for(int i = 1; i <= 4;i++){
      HeaderTag ht3 = new HeaderTag("h"+i,"Jeg er en h"+i, i);
      lst.add(ht3);
      for(int j = 0; j < 4; j++){
        PTag pt4 = new PTag("p"+i*1+j, "Jeg er en pt tag"+ j);
        lst.add(pt4);
      }
    }
    System.out.println("Size = "+ lst.size());

    Iterator<HTMLTag> ite = lst.iterator();
    while(ite.hasNext()) {
      HTMLTag tg = ite.next();
      if(tg instanceof  PTag){
        ite.remove();
      }
    }
    for(int i =lst.size()-1;i>= 0; i--) {
      HTMLTag tag = lst.get(i);
      if(tag instanceof  PTag){
        lst.remove(i);
      }
    }

    for(HTMLTag tag:lst){
      tag.print();
    }





/*
    ArrayList<HTMLTag> lst = new ArrayList<>();
    lst.add(h1);
    lst.add(h2);
    System.out.println("Size = "+ lst.size());

    PTag pt = new PTag("p1","Jeg er en PTag");
    lst.add(pt);


    for(int i = 1; i <= 4;i++){
      HeaderTag ht3 = new HeaderTag("h"+i,"Jeg er en h"+i, i);
      ArrayList<String> lscol = HTMLStyle.colors;
      ht3.setColor(lscol.get(i-1));
      lst.add(ht3);
      for(int j = 0; j < 4; j++){
        PTag pt3 = new PTag("p"+i*1*j, "Jeg er en pt tag"+ j);
        lst.add(pt3);
      }

    }

    for(HTMLTag htt:lst){
      htt.print();
    }



  }
  */
  }
}

