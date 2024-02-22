//Write a Java program to check the equality of two arrays?

class CheckArrayEquality{

     public static boolean cEquality(int[] x,int[] y){

          int a,b;
          boolean flag=true;

       if(x.length==y.length){

        for(int i=0;i<x.length;i++){

          a=x[i]; b=y[i];
                
         if(a==b) continue;
         else {flag=false; break; }  
            
         }
  }else return false;

      return flag;
}
} 