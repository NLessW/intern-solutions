def beginner_solution():
    n = 1000 - int(input())
    c = [500, 100, 50, 10, 5, 1]
    cnt = 0
    for i in c:
        cnt += n // i
        n %= i
    return cnt


print(beginner_solution())
