
public class MyFirst {
static int a=3;
int b;
static void example()
{
	
	System.out.println("This is my first Java Program");
}
void example2()
{
	
	System.out.println("I love Samarth Aryan Chauhan");
}
MyFirst(int f)
{
	b=f;
	System.out.println("Samarth is a very cute guy "+b);
}
public static void main(String args[])
{
	MyFirst obj = new MyFirst(768);
	obj.example2();
	example();
}
}
