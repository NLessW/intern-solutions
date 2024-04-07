package Day0406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 사용자 입력
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int n = 1000 - Integer.parseInt((b.readLine()));
        int[] c = {500, 100, 50, 10, 5, 1};
        int cnt = 0;

        for (int i : c) {
            if (n / i > 0) {
                cnt += n / i;
                n = n % i;
            }
        }
        System.out.println(cnt);
    }
}