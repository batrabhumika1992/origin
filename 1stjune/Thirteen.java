class A
{
int n=5000;

void display()
{
System.out.println(n);
System.out.println(this.n);
System.out.println(A.this.n);
}

}

class Thirteen
{
public static void main(String args[])
{
A a1=new A();


a1.display();



}


}
