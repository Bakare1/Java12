package DatabaseConnection;
import java.sql.*;


public class DisplayProducts {
    public static void main(String[] args) {
        try{
            //Registering the Driver and Creating an instance of the Driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Driver d = new com.mysql.cj.jdbc.Driver();
            //DriverManager.registerDriver(d);
            // connecting to ur Database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnjava","root","Damilare1");
            //creating Statement
            Statement s = conn.createStatement();
            //Executing a Query and Returning a ResultSet
            ResultSet rs = s.executeQuery("select * from product");

            //Retrieving Column Name
            ResultSetMetaData rsm = rs.getMetaData();
            int colCount = rsm.getColumnCount();
            for(int i = 1; i <= colCount; i++){
                System.out.printf("%10s", rsm.getColumnName(i));
            }


            //Processing Result Set
            while (rs.next()){
                System.out.print(rs.getInt(1) + " ");
                System.out.print(rs.getString(2) + " ");
                System.out.print(rs.getInt(3) + " ");
                System.out.print(rs.getString(4) + " ");
                System.out.println(rs.getString(5) + " ");
            }
            s.close();
            conn.close();

        }catch (Exception e){
            System.out.println("Exception Arised " + e);
        }
    }
}
