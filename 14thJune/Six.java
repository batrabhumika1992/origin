class A
{

static class B
{

	static void display()
	{
	one();
	System.out.println(" Kishen ");
	}
}


static void one()
{
	System.out.print(" Radha ");
}

}


class Six
{
public static void main(String args[])
{

A.B b1=new A.B();
b1.display();

A.B.display();

}

}


