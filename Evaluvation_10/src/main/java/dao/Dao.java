package dao;



import model.Book;
import model.Student;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface Dao {


    void insertBook(Book book) throws SQLException, IOException;

    void insertStudent(Student student) throws SQLException, IOException;



    List<Book> selectAllTodos();

    boolean deleteTodo( int id) throws SQLException;




}
