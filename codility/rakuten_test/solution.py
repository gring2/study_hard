
def get_xor_product(small, last):
    if small is last: return small
    diff = last - small
    mid = small + int(diff / 2)
    first_half = get_xor_product(small, mid)
    last_half = get_xor_product(mid +1 , last)

    result = first_half ^ last_half
    return result

def get_xor_product_iterable(small, last):
    if small is last: return small
    result = small
    while small < last:
        small = small + 1

        result = result ^ small
    return result


def get_xor_produc_tail(small, last, acc):
    if small is last: return acc
    new_acc = acc ^ small+1
    return get_xor_produc_tail(small+1, last, new_acc)
