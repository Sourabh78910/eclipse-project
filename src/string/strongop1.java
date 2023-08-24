package string;

public class strongop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Hello";
String s1="hello guys";
System.out.println(s.concat(s1));
System.out.println(s.length());
System.out.println(s1.contains("guys"));
System.out.println(s.equals(s1));
System.out.println(s.toLowerCase());
System.out.println(s1.toUpperCase());
System.out.println(s.substring(1,5));
System.out.println(s1.startsWith("hello"));
System.out.println(s1.endsWith("guys"));
System.out.println(s.trim());
System.out.println(s1.equalsIgnoreCase(s));
System.out.println(s.charAt(1));
System.out.println(s1.replace("hello", "hai"));

	}

}
