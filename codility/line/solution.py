import sys
from builtins import KeyError


class Structure():

    def __init__(self):
        self.map = {}
        self.operatings = []

    def __add_operation(self, k):
        if k in self.operatings:
            self.operatings.remove(k)
        self.operatings.append(k)

    def add(self, k, v):
        self.map[k] = v

        self.__add_operation(k)

    def get(self, k):
        try:
            result = self.map[k]
            self.__add_operation(k)
            return result
        except KeyError:
            return -1

    def remove(self, k):
        try:
            del self.map[k]

        except KeyError:
            return -1

    def evict(self):
        first = self.operatings[0]
        del self.map[first]
        self.operatings.remove(first)


def operationg(line: str):
    operation_strs = line

    operations = operation_strs.split(' ')
    operation = operations[0]
    print(operations)
    if operation == 'add':
        s.add(operations[1], operations[2])

    elif operation == 'get':
        result = s.get(operations[1])
        print(result)

    elif operation == 'remove':
        s.remove(operations[1])

    elif operation == 'evict':
        s.evict()
    print(s.map)


# line = ''
# s = Structure()
#
# while str(line) != 'exit':
#     line = sys.stdin.readline().split('\n')[0]
#
#     operationg(line)



def add_comma(line):
    value = float(line)
    number =abs(value)

    if number == 0:
        return '0'

    result = []
    while number > 0:

        extra = int(number % 1000)
        number = int(number / 1000)
        result.insert(0, str(extra))

    result = ",".join(result)

    tail = str(value).split('.')[1]

    if tail != '0':
        result = result + '.' + tail

    if value < 0:
        return '-' + result
    else:
        return result