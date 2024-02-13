class FibonachhiSeriesEx{

        public static void fSeries(int n){

          int a=0,b=1;

        System.out.print(a+", "+b); //0,1,1

       for(int i=1;i<=n;i++){  
            int c=a+b;
         System.out.print(", "+c); //1,
             a=b;
             b=c;
 
                     
}
}
}