package dao;

import model.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class StudentDao {

    private HibernateTemplate hibernateTemplate;
    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    @Transactional
    public int insert(Student student){
      int i =(int)this.hibernateTemplate.save(student);
      return i;
    }


    public Student getStudent(int studentId){
        Student student=this.hibernateTemplate.get(Student.class, studentId);
        System.out.println(student);
        return  student;

    }

    public void getAllStudent(){
        List<Student> studentl= this.hibernateTemplate.loadAll(Student.class);
        studentl.forEach(e-> System.out.println(e));

    }

    @Transactional
    public void  deleteStudent(int studentId){
        Student student = this.hibernateTemplate.get(Student.class,studentId);
        this.hibernateTemplate.delete(student);
    }

    @Transactional
    public void updateStudent(Student student,int studentId){
        Student student1 = this.hibernateTemplate.get(Student.class,studentId);
        student1.setStudentCity("Pune");


        this.hibernateTemplate.update(student1);
    }
}
