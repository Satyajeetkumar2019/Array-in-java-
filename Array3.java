//Rule in creating array object
class Array3 { 
	//Rule 01
int[] ia1=new int[2];
//int[3] ia2=new int[];//CE
//int[] ia3=new int[];//CE
//Rule 02
int[] ia4=new int[1];
//int[3] ia5=new int[];
//Rule 03
	public static void main(String[] args) {
	
int[] ia5=new int[0];
//int[] ia6=new int[-1];//RE
int[] ia7=new int['s'];
//int[] ia8=new int[10l];//CE
//int[] ia9=new int[12.0];//CE
//int[] ia10=new int[true];//CE
//int[] ia11=new int["sa"];
//rule 04
int [] i=new int[5];
i[0]=3;
i[1]=4;
i[2]=5;
i[3]=6;
i[4]=90;
//i[5]=3;
//System.out.println(i[2]);
//some special programing 
//spme convesion type
int[] array=new int[(int)12.8];
int[] arr1=new int[(int)12l];
//int[] arr2=new int[(int)true];
int[] arr3={};
int[] i3=new int['a'];
int[] i6=new int[0];
//int[3] arr4={1,2,3};//CE
System.out.println(i3[91]);
//System.out.println(i6[0]);//CE
System.out.println(i3[23.23]);






//System.out.println(ia7[0]);



		System.out.println("Hello World!");
	}//end mm
}//end class
