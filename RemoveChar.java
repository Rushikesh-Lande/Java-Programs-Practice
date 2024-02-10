//Java Program to Remove Characters from the Input String which are Present in the Mask String
class RemoveChar{
    public static void main(String args[]) {
        String str = "jfb6b";
        String check="bob";
        boolean found = false;
 
         RemoveChar obj=new RemoveChar();

             
 System.out.println(obj.m1(str,check));  

       }


     public boolean m1(String str,String check){

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == check.charAt(0) && str.charAt(i + 2) == check.charAt(0)) {

               return true;
            
            }
        }
              return false;
                
     }

    
}

