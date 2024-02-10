class NotPossibleException Exception{

     public NotPossibleException(String str)
    {
      super(str);
      
    } 
}
class throwKeyPrac1{
public static void main(String args[]){
      int a=0,b=10;
      int c;
  if (a==0)
    {
       throw new NotPossibleException("hello");
    }
  else
    {
       System.out.println(c=b/a);
    }
}
}