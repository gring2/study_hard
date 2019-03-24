
def solution(input: str):
    bold = "**"
    italic = "*"
    keyword = "%"
    item = '-'
    splited = input.split('\n')

    for idx, val in enumerate(splited):
        if check(val, bold):
            val = replace(val, bold, ['<bold>', '</bold>'])
        if check(val, italic):
            val = replace(val, italic, ['<italic>', '</italic>'])

        if check(val, keyword):
            val = replace(val, keyword, ['<keyword>', '</keyword>'])

        if val.count(item) == 1:
            val = execute_replace(val, val.index(item), '<item>', item)
            val = val + '</item>'

        splited[idx] = val
    join_str = '\n'.join(splited)

    return make_list(join_str)


def check(input, checker):
    count = input.count(checker)
    if count >= 2 and count % 2 == 0:
        return True
    return False

def replace(input, checker, replacer):
    count = input.count(checker)

    while count > 0:
        input = input[::]
        index = input.index(checker)
        input = execute_replace(input, index, replacer[0], checker)
        index = input.index(checker)
        input = execute_replace(input, index, replacer[1], checker)

        count = count - 2

    return input

def execute_replace(input, index, replacer, checker):
    return input[:index] + replacer + input[index + len(checker):]

def make_list(input: str):

    idx = input.find('<item>')

    if idx != -1:
        input = execute_replace(input, idx, '<list>\n<item>', '<item>')
    else:
        return input
    end_tag_idx = input.rfind('</item>')

    if end_tag_idx != -1:
        input = execute_replace(input, end_tag_idx, '</item>\n</list>', '</item>')

    return input