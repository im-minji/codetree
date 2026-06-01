import java.util.*;
import java.io.*; 

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); 

        int[] arr = new int[N]; 
        int count = 0; 

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++) {
            int cur = Integer.parseInt(st.nextToken()); 
            if(cur%2==0) {
                arr[count] = cur;
                count++; 
            }
        }

        for(int i=count-1; i>=0; i--) {
            int cur = arr[i];
            bw.write(cur + " "); 
        }
        
        bw.flush();
        bw.close(); 

    }
}