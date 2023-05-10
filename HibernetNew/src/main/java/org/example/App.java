
package org.example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//

        System.out.println( "Hello World!" );
//        Configuration configuration = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
       Configuration configuration= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Laptop.class).addAnnotatedClass(Employee.class)
               .addAnnotatedClass(Student.class).addAnnotatedClass(Fullname.class);
        SessionFactory sf = configuration.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction =session.beginTransaction();
        //Getting  using rows using Id
        //student=(Student) session.get(Student.class,2);
//        session.save(student);
//        Student student = new Student();
//        student =session.get(Student.class,2);

//        Laptop laptop1 = new Laptop();
//        Employee employee1 = new Employee();
//        laptop1.setLid(102);
//        laptop1.setLpname("ASUS");
//        Laptop laptop2 = new Laptop();
//        laptop2.setLid(103);
//        laptop2.setLpname("ASUSPRO");
//
//        List<Laptop> laptopslist = new ArrayList<>();
//        laptopslist.add(laptop1);
//        laptopslist.add(laptop2);
//        employee1.setEid(6);
//        employee1.setEName("Pranay");
//        employee1.setLaptop(laptopslist);
//
//
//      session.save(laptop1);
//      session.save(laptop2);
//      session.save(employee1);
//        Student student = new Student();
//        student.setId(3);
//        student.setMarks(88);
//        Fullname name= new Fullname();
//        name.setFname("Sujan");
//        name.setMname("Karem");
//        name.setLname("Shaikha");
//        student.setName(name);
//        session.save(student);

        transaction.commit();
        session.close();
        System.out.println("DONE");




    }
}
