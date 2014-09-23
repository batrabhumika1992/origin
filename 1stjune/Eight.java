class A
{

class B
{

void display()
{
System.out.println("Jai Maa Sita");
say();
}

}

void say()
{
System.out.println("Jai Maa Ambey");
}


}

class Eight
{
public static void main(String args[])
{

A.B b1=new A().new B();

b1.display();

}


}
