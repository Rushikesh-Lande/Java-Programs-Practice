class Exeption_T_C{
     public static void main(String Args[]){
           int  s=5;
           int s1=0;

           System.out.println(s);
          try
{
           System.out.println(s/0);
}
          catch(Exception e)
{
           System.out.println("you can not dived by zero");
           System.out.println(e);  
}
           System.out.println("rest of the code")
}
}