class Example  3 
{

	static void m1(Object obj){
		if(obj instanceof Object){
			System.out.println("if block");
		
		}
		else
			{
		
		System.out.println("else block");
		
		}
	
	
	
	}
	public static void main(String[] args) 
	{
Object obj=new Object();
		m1(obj);
		System.out.println("Hello World!");
	}
}
