package np.edu.scst.classnobject;

public class Student {
    int id;
    String name;
    int classLevel;
    String college;
    
    public Student(){//argumentless constructor
        this(10);
        System.out.println("a student is created");
    }
   
    public Student(int id){//argumented constructor
        System.out.println(id);
    }
    public Student(long id){//argumented constructor
        System.out.println(id);
    }
    
//alt +insert   || rightclick insert code
    public Student(int id, String name, int classLevel, String college) {//argumented constructor
      //when both class variable/property and method/constuctor have same variable with same datatype
      //then first priority goes to the variable inside method scope or its arguments/parameters
       this();//we can only call another constructor from calling constructor, if we call it from first line
      this.id = id;
       this.name = name;
       this.classLevel = classLevel;
       this.college = college;
       
    }

    public Student(String name, int classLevel, String college) {
        this.name = name;
        this.classLevel = classLevel;
        this.college = college;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", classLevel=" + classLevel + ", college=" + college + '}';
    }
    //psvm
    public static void main(String[] args) {
//        Student h = new Student();
        Student ram = new Student(1,"Ram",10,"sagarmatha");
        Student shyam = new Student("Shyam",10,"sagarmatha");
        Student hari = new Student(3,"Hari",10,"sagarmatha");
        System.out.println(ram);
        System.out.println(shyam);
        System.out.println(hari);
    }
    
    
}
