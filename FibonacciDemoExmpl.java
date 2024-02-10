class FibonacciDemoExmpl{

  public static void main(String rgs[]){


     int a=0,b=1,till=50,d;

      System.out.print(a+" "+b+" ");
     
         d=a+b;

     while(d<=till){
         
      System.out.print(d+" ");
          a=b;
          b=d;
          d=a+b;
       }
}
}