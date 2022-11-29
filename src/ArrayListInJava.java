import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListInJava {
    public static void main(String[] args){
        ArrayList ArrList = new ArrayList();
        ArrList.add(10);
        ArrList.add(11);
        ArrList.add(12);
        ArrList.add(13);
        System.out.println(ArrList);
        ArrList.add("Tanvir");
        System.out.println(ArrList);
        ArrList.add(null);
        System.out.println(ArrList);
        ArrayList ArrTwo = new ArrayList();
        ArrTwo.add("Tuhin");
        ArrTwo.add(27);
        ArrTwo.addAll(ArrList);
        System.out.println(ArrTwo);
        ArrTwo.remove(2);
        System.out.println(ArrTwo);
        ArrList.removeAll(ArrTwo);
        System.out.println(ArrList.contains(10));
        ArrList.add(11);
        ArrList.add(12);
        ArrList.add(13);
        System.out.println(ArrList.size());
        System.out.println(ArrList.get(3));
        ArrList.set(2,44);
        System.out.println(ArrList);
        System.out.println(ArrList.indexOf(11));
        Iterator itr = ArrList.iterator();
        while(itr.hasNext()){
            System.out.println("Iterator: "+itr.next());
        }

    }
}
