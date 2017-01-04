
public class copyCns {

	int a,b,c;
	copyCns(int a, int b, int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		//System.out.println("Hello Samarth");
	}
	copyCns(copyCns t)
	{
		a= t.a;
		b= t.b;
		c= t.c;
	}
	public static void main(String args[])
	{
		copyCns obj = new copyCns(10,20,30);
		copyCns obj1 = new copyCns(obj);
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj1.c);
	
	}

}
