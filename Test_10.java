
//Rule #14 in Array in java
class A {
void m1(int...is){
System.out.println("A m1 method");}
}//end class A
class B extends A{
void m1(int...is){
System.out.println("B m1 method ");
}//end m1
}//end class B
class Test_10 { 

	public static void main(String[] args) {
	
	 B  b1=new B();
	b1.m1(); 
   b1.m1(12,32);
 //b1.m1(5l);
  A a1=new B();
  a1.m1();
  a1.m1(4);
//a1.m1(2l);
//		System.out.println("Hello World!");
	}//end mm
}//end class
