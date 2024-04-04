def solution(n):
    if n < 90:
        return 1
    elif n == 90:
        return 2
    elif 90 < n < 180:
        return 3
    else:
        return 4

n = [70, 91, 180, 90]
for i in n:
    print(solution(i))
