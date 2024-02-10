import java.util.*;

public class StreamApiExl{


     public static void main(String regs[]){

    
     List<String> list=new ArrayList<>();

     list.add("Hi");
     list.add("Hey");
     list.add("Hello");
     list.add("Hiiii");

    List<Integer> no=Arrays.asList(1,2,3,4,6,78,65,48,6,48,2,485,184,365484,6664);

          list.stream().filter(n-> n.length()>4).sorted().map(n->n+"000").forEach(n->System.out.println(n));        


}

}


