
public class Constructors {
Constructors()
{
	this(30);
	System.out.println("G");
}
	Constructors(int a)
{
	this(20,10);
	System.out.println ("Hello");
}
Constructors(int a, int b)
{
	System.out.println("Samarth");
}
public static void main(String args[])
{
	new Constructors();
}
}
