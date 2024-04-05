#include <bits/stdc++.h>
using namespace std;
int a, b, c, n[10];
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cin >> a >> b >> c;
    int s = a * b * c;
    while(s > 0) {
        n[s % 10]++;
        s /= 10;
    }

    for (int i : n) cout << i << '\n';
    return 0;
}