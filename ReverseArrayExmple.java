// Write a Java program to reverse an array without using an additional array?

class ReverseArrayExmple{

    public static int[] rA(int[] ar){

        int a=ar.length-1,b=0;

          for(int i=0;i<ar.length/2;i++){ //{2,3,6,5,  4,7,8,6}

                      b=ar[a];
                     ar[a]=ar[i];
                       
                     ar[i]=b;

                      a-- ;

              }
             return ar;
     }
 
}