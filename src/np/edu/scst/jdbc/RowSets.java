package np.edu.scst.jdbc;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class RowSets {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();
        rs.setUrl("jdbc:mysql://localhost:3306/sagarmathadb");
        rs.setUsername("root");
        rs.setPassword("root");

        rs.setCommand("select * from teachers");
        rs.execute();

        while (rs.next()) {
            System.out.print(rs.getInt("id") + "\t");
            System.out.print(rs.getString("name") + "\t");
            System.out.print(rs.getString("gender") + "\t");
            System.out.println(rs.getFloat("salary") + "\t");
        }
        rs.close();



    }
}
