//Write a function to check if a given number is a prime number
/* class PrimeNumberCheck{

     public static boolean pNumber(int n){

                  for(int i=2;i<n;i++){

                  if(n%i!=0){
                       return false;
                   }
                         
                      
                   }
                      return true;                  

               }
}*/


class PrimeMain{

     public static void main(String args[]){

            boolean output=PrimeNumberCheck.pNumber(15);

            if(output==true){System.out.println("its a prime number");}

           else{System.out.println("its not a prime number");}
              
         
     }


}