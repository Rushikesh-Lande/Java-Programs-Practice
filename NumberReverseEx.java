public class NumberReverseEx{

      public static int nReverse(int n){ //2365
            int m=0,sum=0;
         
        while(n>0){
            
           m=n%10  ;
         sum=sum+m;
           n=n/10;              

           }
      return sum;
} 
}