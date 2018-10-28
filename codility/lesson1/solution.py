import math


def get_binary_gap(number):
    if math.log2(number) is 0.0:
        return 0
    binary = convert_to_binary(number)

    return calc_gap(binary)


def convert_to_binary(number):
    result = []

    while number >= 2:
        result.append(number % 2)
        number = int(number / 2)
    result.append(1)
    result.reverse()
    return result


def calc_gap(binary_number_list, gap=0):
    if len(binary_number_list) is 0: return gap

    start = False
    end = False
    acc = []

    while len(binary_number_list) > 0 and end is False:
        number = binary_number_list.pop(0)
        if number is 1 and start is False:
            start = True
        elif number is 1 and start is True:
            binary_number_list.insert(0, number)
            end = True
        elif number is 0 and start is True:
            acc.append(number)

    if len(acc) > gap and end is True:
        gap = len(acc)

    return calc_gap(binary_number_list, gap)
