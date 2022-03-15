
public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s2=("Hello");
		char ch[]= {'h','e','l','l','o'};
		String s3=new String(ch);
		String s4="everyone";
        System.out.println(s2.equals(s1));
        System.out.println(s2.equalsIgnoreCase(s1));
        System.out.println(s1==s2);
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.concat(s4));
        System.out.println(s1+s2);
        System.out.println(String.join(",",s1,s2));
        System.out.println(s4.length());
        System.out.println(s4.toUpperCase());
        System.out.println(s4.toLowerCase());

	}

}
