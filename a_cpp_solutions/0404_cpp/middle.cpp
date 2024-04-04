#include <bits/stdc++.h>
using namespace std;

// 정답 코드 아님 (2차원 배열로 푸는법), 시간복잡도 O(n^2)
void arraySolution(int a1[][2], int a2[][2], int res[][2]) {
    for (int i = 0; i < 2; i++)
        for (int j = 0; j < 2; j++)
            res[i][j] = a1[i][j] + a2[i][j];
}

void printArraySolution(int arr[][2], int rows) {
    cout << "[";
    for (int i = 0; i < rows; i++) {
        cout << "[" << arr[i][0] << "," << arr[i][1] << "]";
        if (i < rows - 1) cout << ",";
    }
    cout << "]" << "\n\n";
}

// 정답 코드, 시간복잡도 O(n^2)
vector<vector<int>> vectorSolution(vector<vector<int>> v1, vector<vector<int>> v2) {
    vector<vector<int>> res;
    for (int i = 0; i < v1.size(); ++i) {
        vector<int> temp;
        for (int j = 0; j < v1[i].size(); ++j) {
            temp.push_back(v1[i][j] + v2[i][j]);
        }
        res.push_back(temp);
    }
    return res;
}

void printVectorSolution(vector<vector<int>>& vRes) {
    cout << "[";
    for (auto& row : vRes) {
        cout << "[";
        for (size_t j = 0; j < row.size(); ++j) {
            cout << row[j];
            if (j < row.size() - 1) cout << ",";
        }
        cout << "]";
        if (&row != &vRes.back()) cout << ",";
    }
    cout << "]\n";
}

int main() {
    // 2차원 배열 구현 실행
    int a1[2][2] = {{1, 2},{2, 3}};
    int a2[2][2] = {{3, 4},{5, 6}};
    int res[2][2];
    cout << "2차원 배열로 구현한 행렬의 덧셈" << "\n";
    arraySolution(a1, a2, res);
    printArraySolution(res, 2);

    // 정답 코드 실행
    vector<vector<int>> v1 = {{1, 2},{2, 3}};
    vector<vector<int>> v2 = {{3, 4},{5, 6}};
    cout << "벡터(동적 배열)로 구현한 행렬의 덧셈" << "\n";
    vector<vector<int>> vRes = vectorSolution(v1, v2);
    printVectorSolution(vRes);
    return 0;
}