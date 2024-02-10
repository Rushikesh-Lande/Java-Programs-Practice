
class LargestNoArray{
  public static void main(String args[]){

     int[] ar={2,4,8,6,8,49,2,8,5};
     int big=ar[0];

       for(int i=0;i<ar.length;i++){
           
       if(big<ar[i]){

          big=ar[i];
             
}

}
   System.out.println(big);
}
}