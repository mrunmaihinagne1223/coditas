package FileHandlingDemo;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        if(file.exists()){
            System.out.println("FILE EXISTS");
        }
        else {
            System.out.println("FILE NOT EXIST");
            file.createNewFile();
            System.out.println("FILE CREATE "+file.exists());


        }

        File file1 = new File("Custome Package");
        System.out.println("file1.exists() before making directory "+file1.exists());
        file1.mkdir();
        System.out.println("file1.exists() after making directory "+file1.exists());
        System.out.println(file1.getAbsoluteFile());
        //__FIRST RUN PACKAGE
//        file1.exists() before making directory false
//        file1.exists() after making directory true
//        C:\Users\Coditas\IdeaProjects\ClassWorks\Custome Package
        File  file3 = new File("Custome Package","abc.txt");

    }
}
