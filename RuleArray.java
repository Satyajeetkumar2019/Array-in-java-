//Rule in array 

class RuleArray { 
//Rule #01
//int...ia;
void m2(int...ia){}
void m2(String...is){}
void m2(Integer...is){}
void m2(Thread...is){}
void m2(Employe...is){}
void m2(Object...is){}
//void m2(class...is){}//CE
//Rule #02
void m1(int ...is){}
//void m1(int..is){}
//void m1(int ...is){}//method alreardy define in belows 
//void m1(int ....is){}
//Rule #03
void m3(int...is){}
void m4(int...is){}
//void m5(int is...){}//CE
//void m6(...int is){}//CE
void m7(int...is){}
//Rule #04
void m7(int[]...is){}
//void m7(int...is){}
void m7(int[][]...is){}
//void m7(int[]...[] is){}//CE
//void m7(int...[] is){}
void m8(int[]sa[]){}
//void m9(int[]sa ...){}
//Rule #05
//void m10(int...gs,int a,int b ){}
//static void m10(int a,int... is,int b){}
static void m10(int a,int b,int ...sa){
System.out.println("\na :"+a);
System.out.println("b :"+b);
System.out.println("sa :"+java.util.Arrays.toString(sa));

}

//Rule #06
//static void m11(int...sa,int...id){}
//static void m11(String...st,int...as){}
//Rule #07
static void m12(){System.out.println("no param");}
static void m12(int n){System.out.println("int param ");}
static void m12(int...is){ System.out.println("int var-arg param");}
//Rule #08
static void m13(int...sa){System.out.println("int  param");}
static void m13(long...n){System.out.println("long  param ");}
static void m13(float...is){ System.out.println("float var-arg param");}
static void m14(boolean...sa){
System.out.println("boolean type");}
static void m14(int...sa){System.out.println("int type");}
//Rule #09
static void m15(int...sa){System.out.println("int type .....");}
static void m15(float...ds){System.out.println("float type");}
//Rule #10
static void m16(int...sa){System.out.println("int var-type conversion ");}
static void m16(int a){System.out.println("int type conversino");}
//Rule #11
static void m17(int[] a){System.out.println("int[] type conversion ");}
static void m18(int...sa){System.out.println("int vertype conversion ");}
//Rule #12
static void m19(int[] sa){System.out.println();}
//static void m19(int...sa){System.out.println();}
//Rule #13







  	public static void main(String[] args) {




/*m16();
m16(12);
m16(1,2,3);
m16(new int[]{89});
*/


/*
m15();
m15(12l);
m15(5F);
*/
/*
		m14(12);
		m14(true);
m13();m13(12l);
float s=12.0f;
m13(s);
m13(12F);




//int s=12;
//m12();
//m12(s);
//m12(12);
//m12(2,3,4,5,5);
//m10();
//m10(6);
//int...iae
//m10(3,4);
//m10(5,6,7);
//m10(12,32,43,23);
*/
		//System.out.println("Hello World!");
	}//end mm
}//end class
class Employe{

}