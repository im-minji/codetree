import java.util.*;
import java.io.*; 

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); 

        int count = 0; 

        for(int i=0; i<N; i++) {
            int sum = 0; 
            StringTokenizer st = new StringTokenizer(br.readLine()); 
            for(int j=0; j<4; j++) {
                int cur = Integer.parseInt(st.nextToken()); 
                sum += cur; 
            }

            if(sum/4 >= 60) {
                bw.write("pass"); 
                bw.newLine(); 
                count++; 
            } else {
                bw.write("fail"); 
                bw.newLine();
            }
        }

        bw.write(count + " "); 
        bw.flush();
        bw.close(); 

    }
}