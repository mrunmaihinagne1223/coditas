package callCenterJDBC;

import TableExist.Connrctivity;

import java.sql.*;
import java.util.Random;
import java.util.Scanner;

public class Users {
    String name,email,simtype;
    int balance,id;
    long mobileNo;

    public Users(String name, String email, String simtype, int balance, long mobileNo) {
        this.id=id;
        this.name = name;
        this.email = email;
        this.simtype = simtype;
        this.balance = balance;
        this.mobileNo = mobileNo;
    }

    public Users() {

    }


    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", simtype='" + simtype + '\'' +
                ", balance=" + balance +
                ", id=" + id +
                ", mobileNo=" + mobileNo +
                '}';
    }

    public void table(){
        try {
        //1: Loading Driver
        Class.forName("com.mysql.jdbc.Driver");
        //2: Establish Connection
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/coditas_eltp","root","Pass@123");
        System.out.println("Connection done ");
        //3: Write Query : using statement
        Statement statement= connection.createStatement();
        System.out.println("Statement done ");
        //4: Resultset
        statement.executeUpdate("CREATE TABLE Users (\n" +
                "  id INT(11) NOT NULL AUTO_INCREMENT,\n" +
                "  name VARCHAR(255) NOT NULL,\n" +
                "  email VARCHAR(255) NOT NULL,\n" +
                "  balance INT(11) DEFAULT 0,\n" +
                "  mobileNo BIGINT(20) NOT NULL,\n" +
                "  PRIMARY KEY (id),\n" +
                "  UNIQUE KEY email_unique (email)\n" +
                ")");

    } catch (ClassNotFoundException e) {
        System.out.println(e);
    } catch (
    SQLException e) {
        System.out.println(e);
    }
        //This code is alredy if return in new connection
        Users users = new Users();
        users.table();

}
    public class Connrctivity {
        static Connection connection(){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                return DriverManager.getConnection("jdbc:mysql://localhost:3306/coditas_eltp","root","Pass@123");
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public void alredyExist(){





    }
    public  void NewConnection(){

        Scanner sc = new Scanner(System.in);

        //making table
        System.out.println("Id");
        id=sc.nextInt();
        sc.nextLine();
        System.out.println("ENTER NAME");
        name = sc.nextLine();
        System.out.println("ENTER EMAIL");
        email = sc.nextLine();
        System.out.println("ENTER BALANCE");
        balance = sc.nextInt();
        Random rs = new Random();
        mobileNo=rs.nextInt(900000000) + 1000000000;
        try {
            //1: Loading Driver
            Class.forName("com.mysql.jdbc.Driver");
            //2: Establish Connection
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/coditas_eltp","root","Pass@123");
            System.out.println("Connection done ");
            //3: Write Query : using statement
            PreparedStatement pr;
            System.out.println("Statement done ");
            //4: Resultset
            pr=connection.prepareStatement("INSERT INTO Users(id,name,email,balance,mobileNo) VALUES (?, ?, ?, ?, ?)");

            pr.setObject(1,id);
            pr.setObject(2,name);
            pr.setObject(3,email);
            pr.setObject(4,balance);
            pr.setObject(5,mobileNo);
            pr.executeUpdate();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        }

        System.out.println("CONNECTION ESTABLISED");
        System.out.println("USERS MOBILE NO IS : "+mobileNo);



    }
    public  void  display(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("ENTER YOUR MOBILE NO");
        long usersmobile = sc.nextLong();
        try {
            //1: Loading Driver
            Class.forName("com.mysql.jdbc.Driver");
            //2: Establish Connection
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/coditas_eltp","root","Pass@123");
            System.out.println("Connection done ");
            //3: Write Query : using statement
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM users WHERE mobileNo = ?");
            ps.setLong(1, usersmobile);
            System.out.println("Statement done ");
            //4: Resultset
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                id=rs.getInt("id");
                name= rs.getString("name");
                email=rs.getString("email");
                balance=rs.getInt("balance");
                mobileNo=rs.getLong("mobileNo");
                System.out.println("id: " + id + "\n name: " + name + "\n email: "+email+
                        "\n balance: "+balance+"\n mobileNo "+mobileNo);
            }


        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (
                SQLException e) {
            System.out.println(e);
        }




    }
    public void prepaid(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("ENTER YOUR MOBILE NO");
        long usersmobile = sc.nextLong();

        try {
            //1: Loading Driver
            Class.forName("com.mysql.jdbc.Driver");
            //2: Establish Connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coditas_eltp", "root", "Pass@123");
            System.out.println("Connection done ");
            //3: Write Query : using statement
            PreparedStatement ps = connection.prepareStatement("select  balance,name,mobileNo from users where mobileNo = ?");
            ps.setLong(1, usersmobile);
            System.out.println("Statement done ");
            //4: Resultset
            ResultSet rs = ps.executeQuery();
            boolean flage1 = false;
            while (rs.next()) {
                if (usersmobile == rs.getLong("mobileno")) {
                    flage1 = true;
                    System.out.println("WELECOM YOUR VALIDE USER : " + rs.getString("name"));
                    System.out.println("ENTER 1 RECHARHGE \n ENTER 0 EXIT");
                    boolean flageforinnerloop=true;
                    int ch = sc.nextInt();
                    switch (ch) {
                        case 1:
                            System.out.println("YOUR BALANCE IS : " + rs.getInt("balance"));
                            Scanner sc1 = new Scanner(System.in);
                            System.out.println("ENTER AMOUNT TO RECHA");
                            int userInputMobile = sc1.nextInt();
                            PreparedStatement ps1 = connection.prepareStatement("UPDATE Users SET balance = balance + ? WHERE mobileNo = ? ");
                            ps1.setInt(1,userInputMobile);
                            ps1.setLong(2,usersmobile);
                          ps1.execute();
                            System.out.println("SUCCESSFULL RECHARG "+rs.getString("name"));
                            break;
                        case 0:
                            flageforinnerloop = false;
                            break;


                    }
                }
                else {
                    try {
                        throw new UserNotExsistException();
                    } catch ( UserNotExsistException e) {
                        System.out.println();
                    }
                }


            }
        }

         catch (ClassNotFoundException e) {
            System.out.println(e.getMessage()+"  "+e.getStackTrace());
        } catch (
                SQLException e) {
            System.out.println(e+"1");
        }




    }
}
