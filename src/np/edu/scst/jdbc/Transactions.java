package np.edu.scst.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Transactions {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = null;
        try {
            con = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/sagarmathadb",
                            //dburl/dbname
                            //username   password
                            "root", "root");
            Statement stmnt = con.createStatement();
            //subtarct salary form ram
            //add that salary to sita
            String sql = "UPDATE teachers " +
                    "SET salary = 14000 " +
                    "WHERE id = 1";

            String sql2 = "UPDATE teachers " +
                    "SET salary=16000 " +
                    "WHERE id=4";
            System.out.println(sql);
            System.out.println(sql2);

           //starting transaction
            con.setAutoCommit(false);
            stmnt.executeUpdate(sql);

            try{ Thread.sleep(100);}catch(Exception e){}
            stmnt.executeUpdate(sql2);
        //commit connection
            con.commit();
            System.out.println("query 1 successful");

            System.out.println("query 2 successful");


        } catch (SQLException e) {
            try{
                //rollback connection
                con.rollback();
                System.out.println("rolling back");
            }catch (Exception ex){

            }
        } finally {
            try {
                con.close();
            } catch (SQLException e) {

            }
        }
    }
}
