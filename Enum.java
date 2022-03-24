
public class Enum {

	public enum Season
    {SUMMER,WINTER,FALL,SPRING}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    for(Season s:Season.values())
    	System.out.println(s);
	}

}
