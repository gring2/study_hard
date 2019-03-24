# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

MAX_INT = 1048576
MIN_INT = 0

def solution(S):
    result = -1

    datas = S.split(' ')
    stack = []
    r = 0
    try:
        for x in datas:
            if x.isdigit():
                __push(x, stack)
                # x = int(x)
                # if  MIN_INT < int(x) < MAX_INT:
                #     stack.append(int(x))
                # elif  MIN_INT > x or x > MIN_INT:
                #     MemoryError()
            else:

                r = __ops(x, stack)
                if r == -1:
                    return result

        result = stack[-1]

    except OverflowError:
        return -1

    except MemoryError:
        return -1

    except:
        pass
    return result


def __push(value, stack):
    x = int(value)
    if MIN_INT < int(x) < MAX_INT:
        stack.append(int(x))
    elif MIN_INT > x or x > MIN_INT:
        MemoryError()

def __ops(string, stack):
    if len(stack) < 1:
        return -1
    r = 0
    if string == 'DUP':
        r = __dup(stack)

    elif string == 'POP':
        r = __pop(stack)

    elif string == '+':
        r = __add(stack)

    elif string == '-':
        r = __subtract(stack)

    return r


def __dup(stack):
    stack.append(stack[-1])
    return 0


def __pop(stack):
    stack.remove(stack[-1])
    return 0


def __add(stack):
    if len(stack) < 2:
        return -1
    tmp = stack[-1] + stack[-2]
    stack.pop()
    stack.pop()

    stack.append(tmp)
    return 0


def __subtract(stack):
    if len(stack) < 2:
        return -1
    tmp = stack[-1] - stack[-2]
    stack.pop()
    stack.pop()

    stack.append(tmp)
    return 0
