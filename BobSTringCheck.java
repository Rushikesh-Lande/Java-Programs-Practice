
//abcbob") true

//"b9b")true

//"bac") false

// iv)("abcdefb") false


class BobString{

     public boolean m1(String str){
            for(int i=0;i<str.length()-2;i++){
                   if(str.charAt(i)==str.charAt(i+2))
                      return true;
                   }
              return false;
         }
}

class BobSTringCheck{

   public static void main(String args[]){
       BobString b=new BobString();

       System.out.println(b.m1("bac"));
}

}