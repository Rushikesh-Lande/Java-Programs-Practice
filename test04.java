class test04{
public static void main(String args[]){
      String str="Hello";
      String r ="";
   for(int i=str.length()-1;i>=0;i--)
     {
         r=r+str.charAt(i);

     }
    if(r.equals(str)){
         System.out.println(r+" is a palindrome string");
                     }
    else{ System.out.println(r+" not a palindrome string");}
}
}