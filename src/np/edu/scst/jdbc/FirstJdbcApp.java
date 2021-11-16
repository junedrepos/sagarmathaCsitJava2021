package np.edu.scst.jdbc;

import java.sql.*;

public class FirstJdbcApp {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.
                getConnection("jdbc:mysql://localhost:3306/sagarmathadb",
                        //dburl/dbname
                        //username   password
                        "root", "");
        Statement stmnt = con.createStatement();
        String select = "SELECT * FROM teachers";
        ResultSet  rs = stmnt.executeQuery(select);
        System.out.println("ID\t NAME\t GENDER \t SALARY");
        while(rs.next()){
            //rs.next() checks whether next row is available
            //it points to that particular row
            System.out.print(rs.getInt("id")+"\t");
            System.out.print(rs.getString("name")+"\t");
            System.out.print(rs.getString("gender")+"\t");
            System.out.println(rs.getFloat("salary"));

        }
        stmnt.close();
        con.close();

//        String insert = "INSERT INTO " +
//                "teachers(name,gender,salary) " +
//                "VALUES('shyam','male',12000)";
//        String update ="UPDATE teachers " +
//                "SET name='hari', salary='14000' " +
//                "WHERE id=3";
//        String delete = "DELETE " +
//                "FROM teachers " +
//                "WHERE id=2" ;
//        System.out.println(delete);
//        int result= stmnt.executeUpdate(delete);
//        System.out.println(result);


    }
}
