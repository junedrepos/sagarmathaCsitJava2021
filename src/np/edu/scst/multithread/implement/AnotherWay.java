package np.edu.scst.multithread.implement;

public class AnotherWay {
    public static void print(){
         for(int i =0; i<10; i++){
            System.out.println("hello world from "+Thread.currentThread().getName());
            try{Thread.sleep(1000); }catch(InterruptedException e){}
        }
    }
    public static void main(String[] args) {
        //                                      optional thread name
        Thread t1 = new Thread("T1"){//anonymous inner class  Abstract class | Interfaces
        @Override 
        public void run(){
            print();
        }
        };
         Thread t2 = new Thread("T2"){
         @Override 
        public void run(){
            print();
        }
         };
         t1.start();
         t2.start();
         print();
        
        
    }
}
