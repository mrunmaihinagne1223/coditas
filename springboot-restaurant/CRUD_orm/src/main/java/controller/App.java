package controller;

import dao.StudentDao;
import model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        Student student =new Student("Priyanka","Pune");


    //   studentDao.updateStudent(new Student(),1);
//
      //  studentDao.deleteStudent(2);

//         studentDao.getAllStudent();
        studentDao.getStudent(3);



        System.out.println( "Hello World!" );
    }
}
