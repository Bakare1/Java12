package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class CRUDDemo {
    public void insert(Connection conn) throws Exception{
        PreparedStatement ps = conn.prepareStatement("insert into product values (?,?,?,?,?)");
        int productId,price;
        String productname,category,proddesc;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product_ID : ");
        productId = sc.nextInt();

        System.out.println("Enter Product_Name : ");
        productname = sc.next();

        System.out.println("Enter Price: ");
        price = sc.nextInt();


        System.out.println("Enter Category : ");
        category = sc.next();

        sc.nextLine();

        System.out.println("Input Product Desc : ");
        proddesc = sc.nextLine();

        ps.setInt(1,productId);
        ps.setString(2, productname);
        ps.setInt(3, price);
        ps.setString(4, category);
        ps.setString(5, proddesc);

        int row_eff = ps.executeUpdate();

        if(row_eff > 0){
            System.out.println("Data Entered");
        }else {
            System.out.println("Error Occured");
        }
    }

    public void delete(Connection conn, int productId) throws Exception{
        PreparedStatement psd = conn.prepareStatement("delete from product where productId=?");
        psd.setInt(1, productId);
        int row_eff = psd.executeUpdate();

        if(row_eff > 0){
            System.out.println("Row Deleted");
        }else {
            System.out.println("Problem");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnjava","root","Damilare1");
            System.out.println("Please Select an Option ");
            System.out.println("\t\t Press 1 to Insert ");
            System.out.println("\t\t Press 2 to Delete");
            int option = sc.nextInt();
            switch (option){
                case 1:
                    new CRUDDemo().insert(conn);
                    break;
                case 2:
                    new CRUDDemo().delete(conn,006);
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }

        }catch (Exception e){
            System.out.println("Exception Arised" + e);
        }
    }
}
