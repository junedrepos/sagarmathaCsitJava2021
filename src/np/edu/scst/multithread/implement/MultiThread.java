package np.edu.scst.multithread.implement;

public class MultiThread implements Runnable{
    @Override
    public void run(){
        MultiThread.print();
    }
      public static void print(){
         for(int i =0; i<10; i++){
            System.out.println("hello world from "+Thread.currentThread().getName());
            try{Thread.sleep(1000); }catch(InterruptedException e){}
        }
    }
      public static void main(String[] args) {
        MultiThread m = new MultiThread();
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);
        
        t1.start();
        t2.start();
        MultiThread.print();
    }
    
}
