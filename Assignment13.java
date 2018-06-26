package threadexample;

class ThreadExample extends Thread
{

    public synchronized void run()
    {
        for (int i=1;i<=1000;i++)
        {
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) 
    {
        Thread thread1 = new ThreadExample();
        Thread thread2 = new ThreadExample();
        thread1.start();
        thread2.start();
//        thread1.run();
//        thread2.run();

    }
    
}
