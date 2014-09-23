

class A
{

void display()
{
System.out.println("Mother India");
}

}

class B 
{

A obj=new A()
{

void display()
{
System.out.println("Father India");
}

};


void one()
{
obj.display();
}

}


class Three
{
public static void main(String args[])
{

B b1=new B();
b1.one();


}


}
