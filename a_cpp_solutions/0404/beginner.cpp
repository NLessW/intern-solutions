#include <bits/stdc++.h>
using namespace std;

int solution(int n) {
    if (n < 90) return 1;
    else if (n == 90) return 2;
    else if (90 < n && n < 180) return 3;
    else return 4;
}

int main() {
    int n[4] = {70, 91, 180, 90};
    for (int i : n) cout << "n: " << solution(i) << "\n";
    return 0;
}