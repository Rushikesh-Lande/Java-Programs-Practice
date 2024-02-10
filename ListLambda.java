

import java.util.*;
import java.util.stream.Collectors;

class ListLambda{
 public static void main(String args[]){
    List<Integer> list = Arrays.asList(1,2,3,5,6,8,9);

      List<Integer> l=list.stream().filter(num->num%2!=0).collect(Collectors.toList());

      l.forEach(no->System.out.println(no));
}
}