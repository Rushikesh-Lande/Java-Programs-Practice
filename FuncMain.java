interface FuncExample{int add(int a,int b);}

class FuncMain{
 public static void main(String args[]){
     FuncExample fu=
           ( a, b)-> {return a+b;};	
       

     System.out.println(fu.add(3,6));
}
}