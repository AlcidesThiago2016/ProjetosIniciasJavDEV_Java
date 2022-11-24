package devsuperior.ExceçõesJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class FinallyJava {

    public static void main(String[] args) {

        File file =  new File("/home/thiago/Documentos/in");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Error opening file: " + e.getMessage());
        }
        finally {
            if (sc != null){
                sc.close();
            }
            System.out.println("Finally block executed");
        }
    }
}
