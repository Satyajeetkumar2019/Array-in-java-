
class A {
public void m1(int[] is){System.out.println("A int[]");
}//end m1
}//end A
class B extends A {
	public void m1(int...is){System.out.println("B class m1 method");
}//end m1
}//end B
class Test_12 { 
	public static void main(String[] args) {
	
B b1=new B();
b1.m1();
	b1.m1(12);	
	b1.m1(new int[]{});	
A a1=new A();
//a1.m1();
//a1.m1(12);
a1.m1(new int[]{});


		System.out.println("Hello World!");
	}
}
