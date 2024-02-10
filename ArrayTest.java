//Write a Java program to test if an array contains a specific value.

class ArrayTest{

      public static double m1(int[] arr){

            double sum=0;
             for(int i=0;i<arr.length;i++){

               sum=sum+arr[i];}

                double a=sum/arr.length;
 
             return a;             
                 
            }
     
   public static void main(String args[]){

        int[] a={123,7,2,4,2};

      System.out.println(m1(a));
}
}	