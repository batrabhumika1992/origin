class A
{

void display()
{
System.out.println("India ");
}

}

class Twenty3
{
public static void main(String args[])
{

new A()
{
}.display();


new A(){}.display();

new A().display();


}


}


