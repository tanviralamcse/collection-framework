import java.util.*;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        LinkedList<Integer> l2= new LinkedList<Integer>();
        l1.add(1);
        l1.add(4);
        l1.add(2);
        l1.add(4);

        l2.add(7);
        l2.add(9);
        l2.add(4);
        l2.add(8);
        LinkedList<Integer> addTwo= new LinkedList<Integer>();

        int l1Size, l2Size;
        l1Size = l1.size();
        l2Size = l2.size();

        Iterator i = l1.descendingIterator();
        Iterator j = l2.descendingIterator();
        int sum;
        while(i.hasNext() && j.hasNext()){
           sum = (Integer)i.next();
        }

    }
}
