import java.util.*;
import java.io.*; 

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()); 
        int sum = 0;
        int count = 0; 

        for(int i=0; i<10; i++) {
            int cur = Integer.parseInt(st.nextToken()); 
            
            if(cur == 0) {
                break; 
            }
            sum += cur; 
            count++; 
        }

        double avg = (double) sum / count; 
        String strResult = String.format("%.1f", avg); 

        bw.write(sum + " ");
        bw.write(strResult); 

        bw.flush();
        bw.close(); 
    }
}