class PrintNoAndDigit{

       public static void pNaD(String s){

          String str="";

       for(int i=0;i<s.length();i++){

           if(s.charAt(i)>='a'&& s.charAt(i)<='z' || s.charAt(i)>='0'&&s.charAt(i)<='9') str=str+s.charAt(i);
 
                 }

        System.out.println(str.toUpperCase());

}

}