import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Set set=new HashSet();
    set.add("one");
    set.add("second");
    set.add("3rd");
    set.add(new Integer(4));
    set.add(new Float(0.5));
    set.add("second");
    set.add(new Integer(4));
    System.out.println(set);
	}

}
