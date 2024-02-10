import java.util.ArrayList;
class collection01{
public static void main(String args[]){
       ArrayList<String> c1=new ArrayList<>();
       c1.add("First");   
       c1.add("Second");   
       c1.add("Third");   
       c1.add("Fourth");
           System.out.println(c1);   
   for(String inh:c1)
      {
           System.out.println(inh);   
      }
       c1.remove("Fourth");
           System.out.println(c1); 
       c1.remove(1);
           System.out.println(c1); 
}
}