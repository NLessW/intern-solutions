#include <bits/stdc++.h>
using namespace std;

void beginnerSolution() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);cout.tie(NULL);
    int cnt = 0, n = 380;
    int c[6] = {500, 100, 50, 10, 5, 1};
    // cin >> n;
    // 계산시 낸 돈이 1000엔 이므로 "1000 - 입력값"저장
    int temp = 1000 - n; // 620
    for (int i : c) {
        cnt += temp / i; // 현재 화폐 단위로 나눈 몫을 cnt(count)에 추가
        cout << cnt << " " << temp << " " << i << " " << temp / i << " / "; // 디버깅 로그
        temp %= i; // 현재 화폐 단위로 나눈 나머지를 temp에 저장
    }
    cout << cnt;
}

void middleSolution() {

}

int main() {
    beginnerSolution();
}