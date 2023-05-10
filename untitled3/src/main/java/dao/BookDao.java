package dao;

import model.Book;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface BookDao {


    void insertBook(Book book) throws SQLException, IOException;



    List<Book> selectAllTodos();

    boolean deleteTodo( int id) throws SQLException;



    int updateTodo(int id, Book updatedBook) throws SQLException, IOException;
}
