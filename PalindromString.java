class PalindromString{
    public static void main(String[] args) {

       String sq= "qadar" , reverse="";
      

       for(int i=sq.length()-1;i>=0;i--){

           reverse = reverse + sq.charAt(i);
        
       }
      if(reverse.toLowerCase().equals(sq.toLowerCase())){
             System.out.println(sq+" is a Palindrom String");
       }
     else {  System.out.println(sq+" is Not a Palindrom String");}

}
}
