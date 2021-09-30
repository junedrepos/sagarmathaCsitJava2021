package np.edu.scst.multithread.extending;

public class MultiThread extends Thread{
    
    @Override
    public void run(){//write multithreading codes here
       MultiThread.print();
    }
    public static void print(){
         for(int i =0; i<10; i++){
            System.out.println("hello world from "+Thread.currentThread().getName());
            System.out.println("My priority is :"+ Thread.currentThread().getPriority());
            try{Thread.sleep(1000); }catch(InterruptedException e){}
//  millisecond ;    1000 millisecond = 1 second
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MultiThread mt1 = new MultiThread();
        MultiThread mt2 = new MultiThread();
        //change name of thread  defualt name is Thread-index
        mt1.setName("Mero Thread 1");
        mt2.setName("Mero Thread 2");
//        Thread.currentThread().setName("Mero afnai main thread");
        mt1.setPriority(1);//1
        mt2.setPriority(Thread.MAX_PRIORITY);//10
        mt1.start();//trigger parallel thread
//        mt1.join();
        mt2.start();//trigger another parallel thread
        System.out.println(mt1.isAlive());
        MultiThread.print();
        
        
    }
    
    
    
}
