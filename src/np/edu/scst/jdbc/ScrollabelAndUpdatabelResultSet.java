package np.edu.scst.jdbc;

import java.sql.*;

public class ScrollabelAndUpdatabelResultSet {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.
                getConnection("jdbc:mysql://localhost:3306/sagarmathadb",
                        //dburl/dbname
                        //username   password
                        "root", "root");
        Statement stmnt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE  );
        String sql = "SELECT * " +
                "FROM teachers";
        ResultSet rs = stmnt.executeQuery(sql);
        System.out.println("before");
        System.out.println("ID\t NAME\t GENDER \t SALARY");
        while (rs.next()) {
            System.out.print(rs.getInt("id") + "\t");
            System.out.print(rs.getString("name") + "\t");
            System.out.print(rs.getString("gender") + "\t");
            System.out.println(rs.getFloat("salary") + "\t");
        }
        rs.absolute(2); // update the second row
        float newSalary = rs.getFloat("salary") + 2000;
        rs.updateFloat("salary", newSalary);
        rs.updateRow();
        rs = stmnt.executeQuery(sql);
        System.out.println("after");
        System.out.println("ID\t NAME\t GENDER \t SALARY");
        while (rs.next()) {
            System.out.print(rs.getInt("id") + "\t");
            System.out.print(rs.getString("name") + "\t");
            System.out.print(rs.getString("gender") + "\t");
            System.out.println(rs.getFloat("salary") + "\t");
        }




    }

}
