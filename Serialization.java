import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization implements Serializable {
	int id;  
	 String name;  
	 public Serialization(int id, String name) {  
	  this.id = id;  
	  this.name = name;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{    
			  //Creating the object    
			  Serialization s1 =new Serialization(211,"ravi");    
			  //Creating stream and writing the object    
			  FileOutputStream fout=new FileOutputStream("f.txt");    
			  ObjectOutputStream out=new ObjectOutputStream(fout);    
			  out.writeObject(s1);    
			  out.flush();    
			  //closing the stream    
			  out.close();    
			  System.out.println("success");    
			  }
		 catch(Exception e){
			 System.out.println(e);
			 }    
			 }    
}
			