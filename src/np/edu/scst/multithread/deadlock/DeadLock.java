package np.edu.scst.multithread.deadlock;
public class DeadLock {
    public static void main(String[] args) {
        String chair1= "Chair  1";
        String chair2 = "Chair 2";
        Thread ram = new Thread("Ram"){
            @Override
            public void run(){
                synchronized(chair1){
                    try{Thread.sleep(1000); }catch(InterruptedException e){}
                    System.out.println(chair1+" is locked by "+Thread.currentThread().getName());
                    synchronized(chair2){
                    try{Thread.sleep(1000); }catch(InterruptedException e){}
                    System.out.println(chair2+" is locked by "+Thread.currentThread().getName());
                }
                }
            }
        };
               
        
        
        
        
        
           
        
        
        Thread shyam = new Thread("Shyam"){
            @Override
            public void run(){
                synchronized(chair2){
                    try{Thread.sleep(1000); }catch(InterruptedException e){}
                    System.out.println(chair2+" is locked by "+Thread.currentThread().getName());
                    synchronized(chair1){
                    try{Thread.sleep(1000); }catch(InterruptedException e){}    
                    System.out.println(chair1+" is locked by "+Thread.currentThread().getName());
                }
                }
            }
        };
        
        ram.start();
        shyam.start();
        
    }
}
