from collections import Counter
from math import factorial

vowels = ['A', 'E', 'I', 'O', 'U']
maxCount = 1000000007

def solution(S):
    # write your code in Python 3.6
    vs = []
    cs = []
    for c in S:
        if c in vowels:
            vs.append(c)
        else:
            cs.append(c)

    vs_count = len(vs)
    cs_count = len(cs)

    if abs(vs_count - cs_count) >= 2:
        return 0
    if cs_count == 0:
        return 0

    return pc(cs) * pc(vs)


def pc(s):
    s = ''.join(s)
    c = 1
    for i in Counter(s).values():
        c *= factorial(i)
    return factorial(len(s)) // c

