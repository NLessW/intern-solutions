function solution(n) {
    if (n < 90) return 1;
    else if (n === 90) return 2;
    else if (90 < n && n < 180) return 3;
    else return 4;
}

const n = [70, 91, 180, 90];

// print
n.forEach(item => {
    console.log(solution(item));
})