class AddationWithArray  {
static void add(int[] a){
	int sum=0;
if(a.length==0)
	System.out.println("value are not pass");
	else
		
	for(int i=0;i<a.length;i++)
		sum=sum+a[i];
System.out.println("Result sun of array :"+sum);

}//end add method

public static void main(String[] args){
add(new int[]{});
add(new int[]{12,32,78});
add(new int[]{12,12});

}//end mm




}//end class