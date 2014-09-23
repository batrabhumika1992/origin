class A
{

void say()
{
System.out.println("Satnam WaheGuru");
}

}

class Thirty1
{
public static void main(String args[])
{

new A()
{

static final int val=248;

 void one()
{
say();
System.out.println("Hello "+val);
}

}.one();


}


}


