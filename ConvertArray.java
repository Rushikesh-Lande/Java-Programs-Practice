// Write a Java program to convert an array to ArrayList and an ArrayList to array?
import java.util.*;
class ConvertArray{

    public static int[] cAr(List<Integer> arr){

             // List<Integer> list=new ArrayList<>(arr);  
                int z=0;
                int[] aa=new int[arr.size()];
 
              for(int a:arr){

                  aa[z]=a;
                  z++;
              }

             return aa;
        }

}