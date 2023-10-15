package gb.hw.hw1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;

public class Files {

    public static void write(String line) {

        Date date = new Date();
        try (FileWriter fw = new FileWriter("db.txt", true)) {
            fw.write(date.toString() + " " + line + "\n");
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public static void show() {

        try (BufferedReader br = new BufferedReader(new FileReader("db.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
