import java.util.ArrayList;
import java.util.Iterator;

public class Lists {
    private ArrayList<String> list = new ArrayList<String>();

    public Lists(){
        ArrayList ls = this.list;
    }

    public ArrayList addToList(String s){
        list.add(s);
        return list;
    }

    public boolean doesArraylistContain(String s){
        Iterator<String> listIterator = this.list.listIterator();
        while(listIterator.hasNext()){
            String currentString = listIterator.next();
            if(currentString.equals(s)){
                System.out.println("String has been found");
                return true;
            }
        }
        System.out.println("String not found");
        return false;
    }
}
