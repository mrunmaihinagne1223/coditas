package org.example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import java.io.PrintWriter;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Question.class).addAnnotatedClass(Answer.class);

        SessionFactory sf = configuration.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();


        Question question = new Question(1,"Que1");


        Answer answer = new Answer(1,"ans by me 1");
        Answer answer1 = new Answer(2,"ans by me 2");
        Answer answer2 = new Answer(3,"ans by me 3");

        session.save(answer);
        session.save(answer1);
        session.save(answer2);

        List<Answer>answerList=new ArrayList<>();
        answerList.add(answer);
        answerList.add(answer1);
        answerList.add(answer2);

        question.setAnswer(answerList);
        session.save(question);

        transaction.commit();
        session.close();
    }

}
