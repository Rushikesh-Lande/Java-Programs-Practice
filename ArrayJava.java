import java.util.Scanner;
class ArrayJava{
    public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    System.out.println("enter a size of ur String");
    int size =sc.nextInt();
    String sub[]=new String[size];
    sc.nextLine();

    for(int i=0;i<size;i++){
       sub[i]=sc.nextLine();
          

}
     System.out.println("enter a String to search from the array");
     String st=sc.nextLine();

    for(int i=0;i<size;i++){
    if(sub[i].equals(st)){
    System.out.println("String found at index "+i);

}

}
}
}