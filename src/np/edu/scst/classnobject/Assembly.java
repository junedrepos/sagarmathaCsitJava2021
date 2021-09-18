package np.edu.scst.classnobject;


public class Assembly {
      public static void main(String[] args) {
        Mobile samsung = new Mobile();
        samsung.ram=4;
        samsung.battery=4000;
        samsung.version= "2.01E";
        samsung.cameraPixels = 16.4f; 
        samsung.call(10);
        samsung.takePic();
        samsung.playRaceGame();
        //copy +paste to another adjacent line
        //ctrl shift downarrow netbeans
        //ctrl d intellij
        //ctrl c v vs code
        //ctrl space suggestion + intellisense+ autocomplete
        System.out.println("specs of mobile");
        System.out.println("Ram: "+samsung.ram);
        System.out.println("Battery: "+samsung.battery);
        System.out.println(" Version: "+samsung.version);
        System.out.println("Camer Pixels: "+samsung.cameraPixels);
        System.out.println("Wifi Present: "+samsung.isWifi);
        
    }
}
