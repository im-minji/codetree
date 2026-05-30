import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[10];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int cur = Integer.parseInt(st.nextToken());

            if (cur == 0) {
                break;
            }

            arr[i] = cur;
            count++;
        }

        for (int i = count - 1; i >= 0; i--) {
            bw.write(arr[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}