package FileHandaling;

import java.io.File;
import java.io.IOException;

public class filedemo {
    public static void main(String[] args) throws IOException {
        File file = new File("Abc.text");
        if(file.exists()){
            System.out.println("Exist");
        }
        else {
            System.out.println("Not Exists");
            file.createNewFile();
            System.out.println("file crete");
        }
        System.out.println("************Methods in files****************");
        System.out.println("getAbsoult: "+file.getAbsoluteFile());
        System.out.println("getParentFile:  "+file.getParent());
        System.out.println("CanRead: "+file.canRead());
        System.out.println("Can write: "+file.canWrite());
        System.out.println("Get name: "+file.getName());
        System.out.println("Can Execute: "+file.canExecute());

    }

}
