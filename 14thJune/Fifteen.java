class V
{

void two()
{

	class A
	{

		void display()
		{
		System.out.println("Hello Vishnu");
		}
	}
	
	class B extends A
	{
	
	void one()
	{
	System.out.println("Hello Krishna");
	display();
	}

	}


B b1=new B();
b1.one();

}


}


class Fifteen
{
public static void main(String args[])
{

V v1=new V();
v1.two();

}


}


