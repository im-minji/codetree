import java.util.*;
import java.io.*; 

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10]; 
        StringTokenizer st = new StringTokenizer(br.readLine()); 

        for(int i=0; i<arr.length; i++) {
            int cur = Integer.parseInt(st.nextToken()); 
            arr[i] = cur; 
        }

        int result = arr[2] + arr[4] + arr[9]; 

        bw.write(result + " "); 
        bw.flush();
        bw.close(); 

    }
}