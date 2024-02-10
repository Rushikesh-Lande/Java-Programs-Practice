class arrayP{
     public static void main(String args[]){

       String st="Radar";
       String reverse="";
    
       for(int i=st.length()-1;i>=0;i--){
           reverse = reverse + st.charAt(i);
        
}
if(reverse.toLowerCase().equals(st.toLowerCase())){
       System.out.println("true");
}
else{  System.out.println("false");}
}
}