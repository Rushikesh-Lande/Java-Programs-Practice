class AT extends Thread{
     public void run(){
        for(int i = 0;i<=5;i++)
        {
        System.out.println("Rushikesh");
        }
}
}

class MulThread{
public static void main(String args[]){
        AT t=new AT();
        t.start();
 
        for(int i = 0;i<=5;i++)
        {
        System.out.println("Uddhav");
        }
}
}