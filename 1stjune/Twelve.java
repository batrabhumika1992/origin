class A
{
private	int n=10;


	class B
	{
	private	int n=30;
	
		void display()
		{
		int n=50;
System.out.println("Jai Maa Gauri "+n);
System.out.println("Jai Maa Bhavani "+this.n);
System.out.println("Jai Maa Durgey "+A.this.n);
		}


	}



}

class Twelve
{
public static void main(String args[])
{

A.B a1=new A().new B();

a1.display();


}


}
