package dao;

import java.io.IOException;
import java.text.ParseException;

public interface Dao {
    void inser() throws IOException, ParseException;


    void update(int id) throws IOException ;



    void delete(int id) throws IOException;

    void Show(int id) throws IOException;

}
