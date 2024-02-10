import java.util.Scanner;
class While_in_Exception{
public static void main(String args[]){
         int arr[]=new int[3];
         Scanner sc=new Scanner(System.in);
         //int a=sc.nextInt
         arr[0]=25;
         arr[1]=56;
         arr[2]=30;
         boolean flag=true;
          System.out.println("Start ur program");
          
     while(flag){
         try{
                  System.out.println("Start ur program Enter a number of index to see the its value");
                  System.out.println(arr[sc.nextInt()]);
                       flag =false;
            }
          catch(Exception e){
                  System.out.println("Enter any one number of  index  till 2 to see its half value ");

                  System.out.println(arr[sc.nextInt()]/2);
               }
}
}
}