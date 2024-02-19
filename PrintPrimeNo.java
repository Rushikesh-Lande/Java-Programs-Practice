class PrintPrimeNo{
   public static void pNo(int n){
         int flag=0;
      System.out.print(1+",");

       for(int i=2;i<=n;i++){ //7

          for(int j=2;j<i;j++){

           if(i%j==0) {flag++; break;}

                               }
          if(flag==0) System.out.print(i+",");
        
           flag=0;
}

}
}