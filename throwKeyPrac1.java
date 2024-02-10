class NotPossibleException extends Exception{

     public NotPossibleException()
    {
      
      
    } 
}
class throwKeyPrac1{
public static void main(String args[])throws NotPossibleException {
      int a=1,b=10;
      int c;
  if (a==0)
    {
       throw new NotPossibleException();
    }
  else
    {
       System.out.println(c=b/a);
    }
    System.out.println("flow is correct");
}
}


