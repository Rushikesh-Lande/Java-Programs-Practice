class SimpleSleepThread{
public static void main(String args[])throws InterruptedException {

    for(int i=0;i<=3;i++)
    {
     System.out.println(i);
     Thread.sleep(3000);
    }
}
}