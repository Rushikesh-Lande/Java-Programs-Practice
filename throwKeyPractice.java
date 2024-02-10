class SameAnswerException extends Exception{
      public SameAnswerException(String msg)
     {
       super(msg);
     }

}
class ThrowKeyPractice{
public static void main(String args[]){
    int a =10,b=1;
     try{
   int c =a/b;
  if(b==1)
     throw new SameAnswerException("hi");
}catch(SameAnswerException e){
       
      System.out.println("caught the Exception " +e);}
}
}