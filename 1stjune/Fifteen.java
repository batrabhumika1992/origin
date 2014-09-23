class A
{

class B
{
static  final int k=786;

 void display()
{
System.out.println("Hello "+k);
}

}

}


class Fifteen
{
public static void main(String args[])
{

A.B  b1=new A().new B();
b1.display();
}

}
