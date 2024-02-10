//Write a function to compute the the sum of n even numbers


class ComputSum{

      public static int evenSum(int n){
 
                int count=0;

                for(int i=1;i<=n;i++){
                     
                   if(i%2==0){
                        count +=i;

                     }

}
              return count;

}

}

class EvenSumeMain{

     public static void main(String args[]){

          

          System.out.println(ComputSum.evenSum(20));}


}