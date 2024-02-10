class throwKeyPractice extends Exception {
public static void main(String args[]){
      int a=10;b=1;
   if(a/b==a)
   {
    throw new SameResultException();
   }
   else
   {
  System.out.println(a/b);
   }
}
}