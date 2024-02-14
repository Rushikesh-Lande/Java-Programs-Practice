import java.util.Scanner;
public class FindPoNeZeNoEx {
    
      public static void fno(){
        int neg=0;
          int po=0;
          int z=0;

        Scanner sc=new Scanner(System.in);
        String st="y";
        while(!st.equals("n")){
            System.out.println("Enter The Number To Check");
            int n=sc.nextInt();
           
            if(n<0) neg++;
            else if(n>0) po++;
            else if(n==0) z++;
            System.out.println("Press 'y' For Continue or Press 'n' For Stop ");
            sc.nextLine();
            st=sc.nextLine();
        }
        System.out.println("Positive Numbers = " + po);
        System.out.println("Negative Numbers = " + neg);
        System.out.println("Zeros = " + z);
          sc.close();
       
      }
      

}
