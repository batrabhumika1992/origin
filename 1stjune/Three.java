class A
{

private void one()
{
System.out.println("Jai Shree Ram");
}

class B
{

class E 
{

void display()
{
System.out.println("Narayan");
one();
}

}


}


}

class Three
{
public static void main(String args[])
{

A a1=new A();
A.B b1=a1.new B();

A.B.E e1=b1.new E();

e1.display();


}


}
