import linkedlist.imparando.net.MyLinkedList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        MyLinkedList mll = new MyLinkedList();
        ll.add(7);
        ll.add(3);
        ll.add(13);
        mll.add(7);
        mll.add(3);
        mll.add(13);
        Collections.reverse(ll);
        System.out.println(ll);
        System.out.println(mll);
        ll.add( ll.size(), 10);
        mll.add(mll.size(), 10);
        System.out.println(ll);
        System.out.println(mll);
        ll.remove();
        mll.remove();
        System.out.println(ll);
        System.out.println(mll);
        ll.remove(1);
        mll.remove(1);
        System.out.println(ll);
        System.out.println(mll);



    }
}