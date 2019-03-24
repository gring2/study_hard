
# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(N, A):
    # write your code in Python 3.6
    f = list(filter( lambda x: x <= N+1, A))
    result = [0] * N

    min_value = min(f)
    if min_value > N+1:
        return result

    for i, x in enumerate(f):

        if 1 <= x <= N:
            result[x-1] +=1
        elif x == (N+1):
            result = [max(result)] * N

    return result