interface Example {
void m3();
}

class A {
Example m1(){

class B implements Example {
public void m3(){
	System.out.println("B m3");
}//end m3
}//end B

B b=new B();
m2(b);
return b;
}//end of the m1

void m2(Example e){
e.m3();}
}//end clsss