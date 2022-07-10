import java.util.Scanner;

public class StrOperation {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
System.out.println("Enter any String");
Scanner c=new Scanner(System.in);
String r=c.nextLine();


System.out.println(r.length());

 String str1=(r.concat("s"));
System.out.println(str1);
StringOp(str1);

	}
static void StringOp(String str)

{System.out.println(str.toLowerCase());
	
}
	

}
