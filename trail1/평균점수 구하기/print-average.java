import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()); 
        double[] scores = new double[8];
        double sum = 0; 

        for(int i=0; i<scores.length; i++) {
            scores[i] = Double.parseDouble(st.nextToken()); 
            sum += scores[i]; 
        }

        String result = String.format("%.1f", sum/8); 
        bw.write(result); 
        bw.flush();
        bw.close(); 
    }
}