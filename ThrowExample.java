class ThrowKeyPractice{
public static void main(String args[]){
    int a =10,b=0;
     try{
   int c =a/b
  if(b==0){throw new ArithmeticException();}
}catch(ArithmeticException e){System.out.println("caught the Exception");}
}
}