package e_olymp_part_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Nusrat on 10/10/2017.
 */
public class Is_simple_eolymp_3917 {

    public static void main(String[] args) {


        String line = "";
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             PrintWriter pw = new PrintWriter(new File("output.txt"))) {
            while ((line = br.readLine()) != null) {
                long t = Long.valueOf(line);
                for (long i = 2; i * i <= t; i++) {
                    if (t % i == 0) {
                        pw.write("False");
                        return;
                    }
                }

                pw.write("True");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
