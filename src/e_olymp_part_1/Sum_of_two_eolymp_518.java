package e_olymp_part_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Nusrat on 10/10/2017.
 */
public class Sum_of_two_eolymp_518 {
    static long answer;

    public static void main(String[] args) {
        String line = "";
        try(BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter(new File("output.txt"))) {
            while((line = br.readLine())!=null){
               long t = Long.valueOf(line);

               while(t>0){
                   t--;
                   line = br.readLine();
                   String[] s = line.split(" ");
                   pw.write(String.valueOf(Integer.valueOf(s[0])+Integer.valueOf(s[1]))+"\n");
               }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

