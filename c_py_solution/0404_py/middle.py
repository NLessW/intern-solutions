def solution(a1, a2):
    res = []
    for outer in range(len(a1)):
        temp = []
        for inner in range(len(a1[outer])):
            temp.append(a1[outer][inner] + a2[outer][inner])
        res.append(temp)
    print(res)
    return res


a1 = [[1, 2], [2, 3]]
a2 = [[3, 4], [5, 6]]
solution(a1, a2)
