// Write a Java program to find all pairs of elements in an integer array whose sum is equal to a given number?

class CheckSumExp{
   
    public static void sNo(int n,int[] aa){

      for(int i=0;i<aa.length;i++){ //  n=8

       for(int j=i+1;j<aa.length;j++){

           if(aa[i]+aa[j]==n) {

           System.out.println(aa[i]+" + "+aa[j]+" = "+n);

                   }
  
     }

   }
}
}