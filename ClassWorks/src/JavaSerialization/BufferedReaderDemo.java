package JavaSerialization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {
        // create a BufferedReader object to read input from the console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // read a line of text from the console
        System.out.print("Enter some text: ");
        String input = reader.readLine();

        // display the input back to the user
        System.out.println("You entered: " + input);

        System.out.print("Enter some NUMBER: ");
        int number = Integer.parseInt(reader.readLine());
        System.out.println("You entered: " + number);

        // close the BufferedReader to release any system resources
        reader.close();
    }
}

