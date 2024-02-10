
class ReverseWordString{

      public String m1(String s){//hey there java program

            String rev="";
            String[] sp=s.split(" ");
            
            for(int i=0;i<sp.length;i++)
                     {
                         
                        String str=sp[i];
                        String st="";
            for(int j=str.length()-1;j>=0;j--){
                         st=st+str.charAt(j);
                         
                           }
                         rev=rev+st+" ";
                      }
            

            return rev;

       }

  public static void main(String... args){

       ReverseWordString obj=new ReverseWordString();

       System.out.println(obj.m1("hey there java program"));

       
}
}