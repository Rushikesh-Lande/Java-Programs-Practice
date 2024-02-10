class oddeven{
public static void main(String args[]){
          int arr[]=new int[6];
try{
arr[0]=56;
arr[1]=6;
arr[2]=5;
arr[3]=567;
arr[4]=210;
arr[5]=552;
arr[6]=12;}

catch(ArrayIndexOutOfBoundsException e){

//throw new ArrayIndexOutOfBoundsException("hello");

System.out.println(e);}

}
}