package e_olymp_part_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Nusrat on 10/10/2017.
 */
public class NOD_eolymp_3920 {

    static long nod(long n1, long n2){
        while(n1!=0 && n2!=0) {
            if (n1 > n2) {
                n1 = n1 % n2;
            } else {
                n2 = n2 % n1;
            }
        }
        return n1+n2;
    }

    public static void main(String[] args) {

        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             PrintWriter pw = new PrintWriter(new File("output.txt"))) {
            line = br.readLine();
            String[] s = line.split(" ");
            long[] numbers = new long[s.length];
            int i = 0;
            for (String ss: s) {
                numbers[i] = Long.valueOf(ss);
                i++;
            }

            int pointer = numbers.length-1;

            while (pointer!=0){
                numbers[pointer-1] = nod(numbers[pointer], numbers[pointer-1]);
                pointer--;
            }

            pw.write(String.valueOf(numbers[0]));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
