class Addationss  
{
static void add(int...a){
	int sum=0;
if(a.length==0)
	System.out.println("value are not pass");
	else
		
	for(int i=0;i<a.length;i++)
		sum=sum+a[i];
System.out.println("Result sun of array :"+sum);

}//end add method



	public static void main(String...args) 
	{


add();
add(4);
add(21,32);

		//System.out.println("Hello World!");
	}
}
