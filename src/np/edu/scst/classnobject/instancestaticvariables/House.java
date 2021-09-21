package np.edu.scst.classnobject.instancestaticvariables;

public class House {
    int area;
    int floor; 
    String location;
    static int budget = 50000000;
    
    public House(int area, int floor, String location, int budget){
        this.area = area;
        this.floor = floor;
        this.location = location;
        House.budget = House.budget - budget;
    }
    
    public static void main(String[] args) {
        House h1 = new House(500, 3, "New road", 15000000);
        System.out.println(h1.area);
        System.out.println("Remaining budget: "+House.budget);
        
        House h2 = new House(400, 4,"Durbar marg", 15000000);
        System.out.println("Remaining budget: "+House.budget);
        
        House h3 = new House(400, 1,"Balwatar", 10000000);
        System.out.println("Remaining budget: "+House.budget);
        System.out.println(budget);
    }
    
}
