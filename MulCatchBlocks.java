class MulCatchBlocks{
       public static void main(String Args[]){
      double a=88826448,b=3558484,c;
        c=a/b;
      int arr[]={2,5,4,78,96};
      String st=null;
      try{
         System.out.println(c);
         System.out.println(arr[3]);
         System.out.println(st.toUpperCase());
         }
      catch(ArithmeticException ar){
              System.out.println("Arithmetic Exception Occurse");
             }
      catch(ArrayIndexOutOfBoundsException Ai){
              System.out.println("ArrayIndexOutOfBounds Exception Occurse");
             }
      catch(NumberFormatException Nf){
             System.out.println("NumberFormat Exception Occurse");
             }
     catch(Exception ee){
             System.out.println("other Exception Occurse");
             }


}
}