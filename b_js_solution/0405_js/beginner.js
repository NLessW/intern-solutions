//const n = +(require('fs').readFileSync('/dev/stdin').toString().trim());
const n = 5;
let res = '';
for (let i = n; i > 0; i--) {
    res += '*'.repeat(i) + '\n';
}
console.log(res);
