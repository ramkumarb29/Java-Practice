import java.util.*;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List list=new LinkedList();
    //List list=new ArrayList();
    list.add("one");
    list.add("second");
    list.add("3rd");
    list.add(new Integer(4));
    list.add(new Float(0.5));
    list.add("second");
    list.add(new Integer(4));
    System.out.println(list);
	}

}
