/*class A{
       void m() throws IOException
   {
        throw new IOException();
   }
}
class throwExample1{
    public static void main(String args[]){
       try{ A r=new A();
         r.m();
          } 
       catch(Exception e)
          {System.out.println("IO E");}
System.out.println("normal flow...");  

}
}*/

class M{  
 void method()throws IOException{  
  throw new IOException("device error");  
 }  
}  
public class throwExample1{  
   public static void main(String args[]){  
    try{  
     M m=new M();  
     m.method();  
    }catch(Exception e){System.out.println("exception handled");}     
  
    System.out.println("normal flow...");  
  }  
}  