package TableExist;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {
    public static void main(String[] args) {
        Connection cnn = Connrctivity.connection();
        try {
            Statement sc =cnn.createStatement();

            try{
                ResultSet rs = sc.executeQuery("select*from students1");
                System.out.println("Alredy exist");
            }catch (SQLException e){
                if(e.getMessage().equals("Table'corejavajdbc.students1'doesn't exist")){
                    sc.execute("create table Student(id int primary key, name varchar(25), marks int);");
                    sc.execute("create table result(id int primary key, name varchar(25), marks int);");

            }

        }

    } catch (SQLException e) {
            System.out.println(e);
        }
    }}

