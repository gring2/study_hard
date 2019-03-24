
def solution(payload, k):
    if k > len(payload) > 0:
        k = k % len(payload)
    if k is 0 or payload is 0:
        return payload
    shift = payload[-k:]
    left = payload[:len(payload) -k]
    return shift + left


def twoSum( nums, target):
        hash_map = dict()

        for index, val in enumerate(nums):
            if val in hash_map:
                return [hash_map[val], index]

            hash_map[target - val] = index

result = twoSum([0,4,3,0], 0)

print(result)