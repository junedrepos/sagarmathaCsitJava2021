package np.edu.scst.multithread.synchronizeddemo;
public class College {
    public synchronized void classRoom(){//synchronized method
         for(int i =0; i<10; i++){
            System.out.println("This class is currently being taught by "+Thread.currentThread().getName());
            try{Thread.sleep(1000); }catch(InterruptedException e){}
        }
    }
    public static void main(String[] args) {
        College c = new College();
        Thread ram = new Thread("Ram sir"){
            @Override
            public void run(){
                c.classRoom();
            }
        };
        Thread shyam = new Thread("Shyam sir"){
            @Override
            public void run(){
                c.classRoom();
            }
        };
        ram.start();
        shyam.start();
        
    }
}
