package np.edu.scst.abstraction;

public class ChildOfAbstract extends AbstractClass{
  
//     public abstract void abstractMethod();
@Override
    public void abstractMethod() {
    System.out.println("Child of Abstract");
    }
    
    @Override
    public  void balanceCheck() {
        System.out.println("Balance check");
      }

    @Override
    public void withDraw() {
        System.out.println("With Draw");
     }

    @Override
    public void changePassword() {
        System.out.println("Change password");
     }
    public static void main(String[] args) {
        ChildOfAbstract abs = new ChildOfAbstract();
        abs.balanceCheck();
        
    }

    
    
}
