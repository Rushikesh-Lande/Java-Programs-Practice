import java.util.*;
class MainClass{
  public static void main(String[] args){
      // int[] arr={ 12,12,54,5,4,5,5,5,4,752,-4,5,333,-4};
        int[] i1 = {1,0,0, 2, 3,0, 4, 5, 4,0,-1};
        int[] i2 = {3, 4, 5, 6, 7, 4};
      
      List<Integer> result=SeparateZero.sZero(i1);
      System.out.print(result);

       //for(int a:result){ System.out.print(" "+a);}


}
}