interface I
{
void display();
}


class V
{

I two()
{

	class A implements I
	{

		public void display()
		{
		System.out.println("India");
		}
	}

A a1=new A();
return a1;
	
}


}


class Sixteen
{
public static void main(String args[])
{

V v1=new V();
I obj=v1.two();
obj.display();

}


}


