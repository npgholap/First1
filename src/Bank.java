

import java.util.Scanner;
class Bankdetail
{private int pwd=123;
private int money;private int bal=20000;

void balcheck(int a)
	{if (pwd==a)
	{System.out.println("balance="+bal);
		} else 
			System.out.println("wrong password");
		
	}

void balwithdrw(int a,int money)
{
	if (pwd==a)
	{
		bal=bal-money;
	System.out.println("balance="+bal);
	} else 
		System.out.println("wrong password");
	
}
void baldeposite(int a, int money)
{
	if (pwd==a)
	{
		bal=bal+money;
	System.out.println("balance="+bal);
	} else 
		System.out.println("wrong password");
	
}

}

public class Bank {

	public static void main(String[] args) {
		int ch;
		Bankdetail b= new Bankdetail();
		
		System.out.println("enter ur choice 1: balcheck 2:balwidth 3:deposit");
		Scanner r= new Scanner(System.in);
		ch=r.nextInt();
		switch(ch)
		{
		case 1:System.out.println("enter ur password");
		
		Scanner r1= new Scanner(System.in);
		int pass=r1.nextInt();
			b.balcheck(pass);
			break;
			
		case 2:	System.out.println("enter ur password and money");
		
		Scanner r2= new Scanner(System.in);
		int pas=r2.nextInt();
		int m= r2.nextInt();
			b.balwithdrw(pas,m);
			//System.out.println("enter ur password and money");
			break;
			
		case 3:	System.out.println("enter ur password and money");
		Scanner r3= new Scanner(System.in);
			int paswd=r3.nextInt();
			int m1= r3.nextInt();
				b.baldeposite(paswd,m1);
				break;
				
				default:System.out.println("wrong choice");
		}
	}
		// TODO Auto-generated method stub

	}


