class A {
    public void print_A() { System.out.println("Class A"); }
}
 
class B extends A {
    public void print_B() { System.out.println("Class B"); }
}
 
class C extends A {
    public void print_C() { System.out.println("Class C"); }
}
 
class D extends A {
    public void print_D() { System.out.println("Class D"); }
}
        
public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B B = new B();
        B.print_A();
        B.print_B();
 
        C C = new C();
        C.print_A();
        C.print_C();
 
        D D = new D();
        D.print_A();
        D.print_D();
    }
	}


