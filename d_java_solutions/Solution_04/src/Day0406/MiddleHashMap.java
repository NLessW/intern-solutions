package Day0406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// Time - O(m + n)
public class MiddleHashMap {
    public static void main(String[] args) throws IOException {
        int res = 0;
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String s1= br.readLine();
        // String s2 = br.readLine();
        // br.close();
        String s1 = "aabbcc"; // tc
        String s2 = "xxyybb";

        // 해시맵 초기화 s1,s2의 key:(char, 문자), val:(int, 등장 횟수)저장
        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();

        // 문자열 1,2(s1, s2)에서 문자별로 출력 빈도 해시맵에 저장
        for (char cnt : s1.toCharArray()) {
            m1.put(cnt, m1.getOrDefault(cnt, 0) + 1);
            System.out.println("맵1 업뎃: " + cnt + " => " + m1.get(cnt)); // 디버깅 로그
        }
        System.out.println("=".repeat(15)); // 출력 구분선
        for (char cnt : s2.toCharArray()) {
            m2.put(cnt, m2.getOrDefault(cnt, 0) + 1);
            System.out.println("맵2 업뎃: " + cnt + " => " + m2.get(cnt));
        }

        // 디버깅 로그: 해시맵의 내용 출력
        System.out.println("=".repeat(15)); // 출력 구분선
        System.out.println("m1 결과: " + m1);
        System.out.println("m2 결과: " + m2);
        System.out.println("=".repeat(15)); // 출력 구분선

        // 두 해시맵(m1, m2)의 차이를 계산하여 두 문자열을 같게 만들기 위해 제거해야 할 문자의 총 개수를 계산
        // 이때, m1에 있는 각 문자에 대해 m2에서의 해당 문자의 등장 횟수를 차감
        for (char cnt : m1.keySet()) {
            // res += Math.abs(m1.get(cnt) - m2.getOrDefault(cnt, 0));

            // 디버깅 로직
            int temp = Math.abs(m1.get(cnt) - m2.getOrDefault(cnt, 0));
            System.out.println(cnt + " 문자 차이: " + temp); // 디버깅 로그
            res += temp;
        }
        System.out.println("=".repeat(15)); // 출력 구분선

        // m2 -> m1 차이 계산 (m2에만 존재하는 문자 처리)
        for (char cnt : m2.keySet()) {
            if (!m1.containsKey(cnt)) {
                System.out.println(cnt + "는 m1에 없으므로 m2에서 제거해야 함.\n개수: " + m2.get(cnt)); // 디버깅 로그
                res += m2.get(cnt);
            }
        }
        System.out.println("=".repeat(15)); // 출력 구분선
        System.out.println(res);
    }
}