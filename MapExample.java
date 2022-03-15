import java.util.*;
public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //Map map=new LinkedHashMap();
    //Map map=new HashMap();
    Map map=new TreeMap();
    map.put("Two", "Tuesday");
    map.put("One", "Monday");
    map.put("Three", "Wednesday");
    map.put("Five", "Friday");
    map.put("Four", "Thursday");
    map.put("Seven", "Sunday");
    map.put("Six", "Saturday");
    
    Set set1=map.keySet();
    Collection collection=map.values();
    Set set2=map.entrySet();
    
    System.out.println(set1 + "\n" + collection + "\n" + set2);
	}

}
