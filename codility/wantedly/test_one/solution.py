import math


def solution(A):
    A = list(str(A))

    l = len(A)
    half_l = math.ceil(l/2)

    first = A[0: half_l]
    result = ''
    for i, x in enumerate(first):
        result = result + x
        lst_index = l - i - 1

        if lst_index != i:

           result = result + A[lst_index]


    # last = A[half_l:][::-1]
    #
    # result = [None] * l
    #
    # for i, x in enumerate(result):
    #     if i % 2 == 0:
    #         result[i] = first.pop(0)
    #     else:
    #         result[i] = last.pop(0)
    #
    return int(''.join(result))

# def solution(A):
#     str_A = list(str(A))
#
#     result = ''
#     while len(str_A) > 0:
#
#         first, last = pop_element(str_A,0), pop_element(str_A)
#         # last = str_A.pop()
#         # if len(str_A) > 0:
#         #     first = str_A[0]
#         # else:
#         #     first = ''
#         # str_A = str_A[1:]
#         result = result + ( '' if is_None(first) else first) + ( '' if is_None(last) else last)
#
#     return int(result)
#
#
# def pop_element(list, index = None):
#     if len(list) == 0:
#         return None
#     if index is None:
#         index = -1
#     return list.pop(index)
#
#
# def is_None(target):
#     if target:
#         return False
#     return True