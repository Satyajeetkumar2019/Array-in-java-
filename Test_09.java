class A{
void m1(long...ia){
System.out.println("A is long ");
}//end m1
}//end A

class B extends A {
	void m1(int...ia){
System.out.println("B is  int ");
}//end m1

}//end B
class Test_09 { 
	public static void main(String[] args) {
	
	B  b1=new B();
	b1.m1(); 
b1.m1(5);
b1.m1(12,32);
b1.m1(5l);
A a1=new B();
a1.m1();
a1.m1(4);
a1.m1(2l);


	//	System.out.println("Hello World!");
	}//end mm
}//end class test
