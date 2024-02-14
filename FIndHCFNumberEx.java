class FIndHCFNumberEx{

   public static int nHCF(int first, int sec){//18 , 13

        int flag=0;

          for(int i=1;i<=first;i++){ //16

                 if(first%i==0 && sec%i==0){

                        flag=i;                     
                    }           
 
             }
       return flag;
}
}