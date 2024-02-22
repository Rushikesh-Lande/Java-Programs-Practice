// Write a program to find number and sum of all integer between 100 and 200 which are divisible by 9


class FindSumOfIntegers{

   public static void fSum(){
          int count=0,sum=0;
           
       for(int i=100;i<=200;i++){

          if(i%9==0) {count++; sum=sum+i;}

                 }
      System.out.println("count is = "+count+" and sum is = "+sum);
}
}