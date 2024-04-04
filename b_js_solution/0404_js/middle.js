function solution(a1, a2) {
    return a1.map((row, i) =>
        // val = a1 (1,2,2,3)
        row.map((val, j) => val + a2[i][j])
    )
}

const a1 = [[1,2],[2,3]];
const a2 = [[3,4],[5,6]];
console.log(solution(a1, a2))