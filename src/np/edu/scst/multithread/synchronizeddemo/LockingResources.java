package np.edu.scst.multithread.synchronizeddemo;

public class LockingResources {

    public static void main(String[] args) {
        String duster = "I am duster";
        Thread ram = new Thread("Ram") {
            @Override
            public void run() {
                //                  name of resource we want to lock
                synchronized (duster) {
                    for (int i = 0; i < 10; i++) {//synchronized block
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                        System.out.println(duster + " being used by " + Thread.currentThread().getName());
                    }
                }
            }
        };

        
        
        
        
        Thread shyam = new Thread("Shyam") {
            @Override
            public void run() {
                synchronized (duster) {//synchronized block
                    for (int i = 0; i < 10; i++) {
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                        System.out.println(duster + " being used by " + Thread.currentThread().getName());
                    }
                }
            }
        };
        ram.start();
        shyam.start();
    }
}
