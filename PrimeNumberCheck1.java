class PrimeNumberCheck1{

         public static boolean pNumber(int a){
            int flag=0;
           if(a==0||a==1) return false;
           else {

           for(int i=2;i<a;i++){

           if(a%i==0){
             flag++;
             break;
                     }
                               }
   if(flag==1) return false;
   else  return true;
}
}
}