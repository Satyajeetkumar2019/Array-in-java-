class Example1 { 
	
static void m1(int[] ia){

ia[2]=29;
}//end m1


	public static void main(String[] args) {
	int[] ia={10,20,30,40,50};
	m1(ia);
	int[] ia1={1,2,78,3};
	m1(ia1);

for(int i=0;i<ia1.length;i++){
System.out.println(ia1[i]);

}

for(int i=0;i<ia.length;i++){
System.out.println(ia[i]);

}
	//	System.out.println("Hello World!");
	}
}
