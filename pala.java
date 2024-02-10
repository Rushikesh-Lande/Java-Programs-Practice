class pala{
   public static void main(String args[]){
      String str="naman";
     boolean isPal=true;
  //   char ch[]=str.toCharArray();
 //   System.out.println(ch);

     for(int i=0,j=str.length()-1;i<j;i++,j--)

             {
            if(str.charAt(i)!=str.charAt(j))
               {isPal=false; break;}
              
             }
       if(isPal)
         {System.out.println("is palindrome");}
       else
        {
         System.out.println("not palindrome");
        }
}
}