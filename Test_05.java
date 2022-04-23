class Addation {
static void add(){
System.out.println("no param constructor :");
}
static void add(int x){
System.out.println("int  param constructor :");
}
static void add(int x,int y){
System.out.println("two  param constructor :");
}
static void add(int x,int y,int z){
System.out.println("three  param constructor :");
}
static void add(int x,int y,int z,int s){
System.out.println("for  param constructor :");
}
}//
class Test_05{ 

	public static void main(String[] args) {
	
Addation add=new Addation();
add.add();
add.add(12);
add.add(12,32);
add.add(1,2,3);
add.add(89,78,56,344);
		System.out.println("Hello World!");
	}//end mm
}//end class
