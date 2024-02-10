public class ChangesArrayOrder{

       public static int[] cao(int[] arr){

              int al=arr.length;
              int arr2[]=new int[al];
              arr2[al-1]=arr[0];
              for(int i=1;i<al;i++){
                    arr2[i-1]=arr[i];
                 }

              return arr2;
           }

}

