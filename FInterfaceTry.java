interface TryF{

     int add(int a, int b);
}

class FInterfaceTry{

  public static void main(String args[]){


       TryF obj=( a, b)->{
                
                    return a+b;

       };

       int a=obj.add(5,2);

 System.out.println(a);



}


}