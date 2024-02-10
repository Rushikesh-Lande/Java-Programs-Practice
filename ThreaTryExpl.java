

class ThreaTryExpl extends Thread
{
    @Override
    public void run(){
for(char i='a';i<='z';i++){
System.out.println(i-'0');}
}


public static void main(String args[])
{

    ThreaTryExpl t=new ThreaTryExpl();

      t.start();

   
 }

}