import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        // 과목 개수 입력받기 
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()); 

        // 점수 입력 받을 배열 
        double[] scores = new double[N]; 
        double sum = 0; 

        // 점수 입력 받기 + 합계 계산하기 
        for(int i=0; i<N; i++) {
            scores[i] = Double.parseDouble(st.nextToken()); 
            sum += scores[i]; 
        }

        // 평균 학점을 반올림해서 소수 첫째 자리까지 출력 
        String result = String.format("%.1f", sum/N); 
        System.out.println(result); 

        // 평균학점에 해당하는 등급 출력하기 
        double grade = Double.parseDouble(result); 
        if(grade >= 4.0) {
            bw.write("Perfect");
        } else if(grade >= 3.0) {
            bw.write("Good"); 
        } else { 
            bw.write("Poor");
        }
        
        bw.flush();
        bw.close(); 
    }
        
}