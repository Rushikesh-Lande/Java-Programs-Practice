//arr[20,2,8,7,-4,5] find second max number
import java.util.*;
class FindSecLarNo{

    public static int slNo(int[] a){

          Arrays.sort(a);

            int l=a.length;
            int output=a[l-2];
            
             return output;
   }
}