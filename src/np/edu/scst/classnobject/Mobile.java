package np.edu.scst.classnobject;

public class Mobile {
    int ram;     int battery;     String version;     float cameraPixels;     boolean isWifi = true;     
    public void takePic(){
        System.out.println("click ");
    }
    
    public void playRaceGame(){
        System.out.println("zoom");
    }
    
    public void call(int ringTime){//parameter
        System.out.println("tring tring "+ringTime);
    }
    //public Mobile(){}
    public static void main(String[] args) {
        Mobile samsung = new Mobile();
        samsung.ram=4;
        samsung.battery=4000;
        samsung.version= "2.01E";
        samsung.cameraPixels = 16.4f; 
        samsung.call(10);//argument
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
        
        Mobile nokia = new Mobile();
        nokia.ram=0;
        nokia.battery=10000000;
        nokia.version="3310";
        nokia.cameraPixels=0.0f;
        nokia.isWifi= false;
        System.out.println("nokia specs: ");
        System.out.println("Ram: "+ nokia.ram);
        System.out.println("Battery: "+ nokia.battery);
        System.out.println("Version: "+ nokia.version);
        System.out.println("Camer Pixels: "+ nokia.cameraPixels);
        System.out.println("Wifi Present: "+ nokia.isWifi);
        
    }
}
