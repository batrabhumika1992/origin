

class A
{

void display()
{
System.out.println("Vishnu Narayan");
}

void say()
{
System.out.println("Jai BholeNath!");
}


}

class Two
{
public static void main(String args[])
{

A obj=new A()
{

void display()
{
System.out.println("Radha Krishna ");
}

void say()
{
System.out.println("Har Har Mahadev");
}


};


obj.display();
obj.say();


}


}
