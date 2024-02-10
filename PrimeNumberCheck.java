class PrimeNumberCheck{

     public static boolean pNumber(int n){

                  for(int i=2;i<n;i++){

                  if(n%i!=0){
                       return false;
                   }
                         
                      
                   }
                      return true;                  

               }
}