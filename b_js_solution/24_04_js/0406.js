// BOJ Input
// const input = require('fs').readFileSync('/dev/stdin').toString();
// const [s1, s2] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
// beginnerSolution(+(input));
// middleSolutionMap(s1, s2);

function beginnerSolution(input) {
    input = 1000 - input; // 잔돈 계산
    const c = [500, 100, 50, 10, 5, 1];
    let cnt = 0;

    // 각 동전을 순회하며 잔돈 계산
    for (let i of c) {
        console.log(`처리 중인 동전: ${i}, 현재 거스름돈: ${input}`); // 디버깅 로그
        cnt += Math.floor(input / i); // 현재 동전으로 거슬러 줄 수 있는 최대 개수 추가
        input = input % i; // 나머지 거스름돈 업데이트
    }
    return cnt;
}

// Time - O(m + n)
function middleSolutionMap(s1, s2) {
    let m1 = new Map(); // key:s1의 각 문자, val: 해당 문자의 출현 빈도
    let m2 = new Map(); // key:s2의 각 문자, val: 해당 문자의 출현 빈도
    let res = 0;

    // m1과 m2에 각 문자 출현 빈도 저장
    for (let c of s1) {
        m1.set(c, (m1.get(c) || 0) + 1);
        console.log(`m1에 '${c}' 추가: ${m1.get(c)}`); // 디버깅 로그
    }

    for (let c of s2) {
        m2.set(c, (m2.get(c) || 0) + 1);
        console.log(`m2에 '${c}' 추가: ${m2.get(c)}`); // 디버깅 로그
    }

    // m1과 m2의 차이 계산
    for (let [c, cnt] of m1) {
        res += Math.abs(cnt - (m2.get(c) || 0));
        console.log(`'${c}' 문자 차이: ${Math.abs(cnt - (m2.get(c) || 0))}`); // 디버깅 로그
    }

    // m2에만 있는 문자 처리
    for (let [c, cnt] of m2) {
        if (!m1.has(c)) {
            res += cnt;
            console.log(`m2의 '${c}'는 m1에 없음. 추가 개수: ${cnt}`); // 디버깅 로그
        }
    }

    return res;
}

function middleSolutionObject(s1, s2) {
    let obj1 = {}; // key:s1의 각 문자, val: 해당 문자의 출현 빈도
    let obj2 = {}; // key:s1의 각 문자, val: 해당 문자의 출현 빈도
    let res = 0;

    // obj1, obj2에 각 문자 출현 빈도 저장
    for (let c of s1) {
        obj1[c] = (obj1[c] || 0) + 1;
        console.log(`obj1에 '${c}' 추가: ${obj1[c]}`); // 디버깅 로그
    }
    for (let c of s2) {
        obj2[c] = (obj2[c] || 0) + 1;
        console.log(`obj2에 '${c}' 추가: ${obj2[c]}`); // 디버깅 로그
    }

    // 두 객체의 차이 계산
    for (let c in obj1) {
        res += Math.abs((obj1[c] || 0) - (obj2[c] || 0));
        console.log(`'${c}' 문자 차이: ${Math.abs(obj1[c] - (obj2[c] || 0))}`); // 디버깅 로그
    }

    // obj2에만 있는 문자 처리
    for (let c in obj2) {
        if (!obj1[c]) {
            res += obj2[c];
            console.log(`obj2의 '${c}'는 obj1에 없음. 추가 개수: ${obj2[c]}`); // 디버깅 로그
        }
    }

    return res;
}

// TC
console.log('동전: ', beginnerSolution(380))
console.log('애너그램: ', middleSolutionMap('aabbcc', 'xxyybb'));
console.log('애너그램: ', middleSolutionObject('aabbcc', 'xxyybb'));
