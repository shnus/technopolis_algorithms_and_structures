package e_olymp_part_1;

import java.io.*;

/**
 * Created by Nusrat on 10/2/2017.
 */
public class Diploms_eolymp_3969 {

    static long answer;

    public static void main(String[] args) {
        String line = " ";
        try(BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            while((line = br.readLine())!=null){
                String[] s = line.split(" ");

                long w = Integer.valueOf(s[0]);
                long h = Integer.valueOf(s[1]);
                long n = Integer.valueOf(s[2]);

                long low = 1, high, mid;
                high = Math.max(w*n, h*n);

                while (low<high) {
                    mid = (low + high) / 2;
                    //для выбранного размера доски, смотрим, помещаются ли все грамоты
                    long hh = mid/h;
                    long ww = mid/w;

                    if (hh*ww<n) {
                        low = mid+1;
                    } else {
                        high = mid;
                    }
                }

                answer = low;


            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(PrintWriter pw = new PrintWriter(new File("output.txt"))) {
            pw.write(String.valueOf(answer));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
