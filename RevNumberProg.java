class RevNumberProg{
  public static void main(String args[]){

      int num=256875;
      int rev=0;
      int n=0;

     while(num!=0){

            n=num%10;
            rev=rev*10+n;
            num=num/10;

         }
            System.out.println(rev);
}
}