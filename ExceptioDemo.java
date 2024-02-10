class AgeLimitException extends Exception{

        AgeLimitException (String msg)
         {
         System.out.println(msg);
         }

}
class ExceptionDemo{
     public static void main(String args[]){

        try
          {
          vote(13);
          }
        catch(Exception e)
          {
           System.out.println(e);
          }   
       
}
     public static void vote(int age) throws AgeLimitException
        {
          if(age<18)
           {
             throw new AgeLimitException("not eligible for voting");
           }
          else
           {
            System.out.println("you are eligible for voting");
           }
        
        }



}



         