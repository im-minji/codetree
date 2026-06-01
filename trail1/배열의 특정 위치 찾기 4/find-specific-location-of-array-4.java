import java.util.*;
import java.io.*; 

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()); 
        
        int count = 0; 
        int sum = 0;

        for(int i=0; i<10; i++) {
            int cur = Integer.parseInt(st.nextToken()); 
            
            if(cur == 0) {
                break; 
            }

            if(cur%2==0) {
                count++; 
                sum += cur; 
            }
        }


        bw.write(count + " ");
        bw.write(sum + " "); 

        bw.flush();
        bw.close(); 
    }
}