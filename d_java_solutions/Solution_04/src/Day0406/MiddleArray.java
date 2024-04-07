package Day0406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// Time - O(m + n)
public class MiddleArray {
    public static void main(String[] args) throws IOException {
        int res = 0;
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String s1 = br.readLine();
        // String s2 = br.readLine();
        // br.close();
        String s1 = "aabbcc"; // tc
        String s2 = "xxyybb";

        // 알파벳 개수 저장 (소문자, 26개, 아스키값 저장함)
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];

        // s1, s2 빈도수 세기
        for (char cnt : s1.toCharArray()) {
            cnt1[cnt - 'a']++;
            System.out.println("cnt1[" + cnt + "], 업뎃: " + cnt1[cnt - 'a']); // 디버깅 로그
        }
        for (char cnt : s2.toCharArray()) {
            cnt2[cnt - 'a']++;
            System.out.println("cnt2[" + cnt + "], 업뎃: " + cnt2[cnt - 'a']);
        }
        // 디버깅 로그 - 최종값
        System.out.println("=".repeat(15)); // 출력 구분선
        System.out.println("cnt1 최종값: " + Arrays.toString(cnt1));
        System.out.println("cnt2 최종값: " + Arrays.toString(cnt2));
        System.out.println("=".repeat(15)); // 출력 구분선

        // s1,s2 차이를 계산하여 불일치하는 문자 제거 횟수 계산
        for (int i = 0; i < 26; i++) {
            // res += Math.abs(cnt1[i] - cnt2[i]);
            
            // 디버깅 로직
            int temp = Math.abs(cnt1[i] - cnt2[i]);
            System.out.println((char)(i + 'a') + " 문자의 차이: " + temp);
            res += temp;
        }
        System.out.println("=".repeat(15)); // 출력 구분선
        System.out.println(res);
    }
}