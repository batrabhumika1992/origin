class A
{

void display()
{
System.out.println("India ");
}

}

class Twenty4
{
public static void main(String args[])
{

new A()
{

void one()
{
display();
System.out.println("America ");
}


}.one();


}


}


