import java.util.LinkedList;

public class Queue {

	public static void main(String[] args) {
    java.util.Queue<Integer> q=new LinkedList<>();
    for(int i=0;i<5;i++)
    {
    	q.add(i);
    }
    System.out.println("Elements of Queue:"+q);
    
    int remove=q.remove();
    System.out.println("Removed Element:"+remove);
    
    System.out.println(q);
    
    int head=q.peek();
    System.out.println("Head element:"+head);
    
    int size=q.size();
    System.out.println("Size:"+size);
	}

}
