package getting_to_know_the_language.java_languaje_basics;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

public class VarVariables {

    public static void main(String[] args) throws IOException {
        var number = List.of(1, 2, 3);
        var number1 = Arrays.asList(1, 2);
        System.out.println(number);
        System.out.println(number1);

        creatingFile();


    }

    public static void creatingFile() throws IOException {
        System.out.println("Creating the file ....");
        var file = new File("./resources");
        file.mkdir();

        if (file.isDirectory()) {
            var archive = new File("./resources/names.txt");
            archive.createNewFile();
        }
    }


}
