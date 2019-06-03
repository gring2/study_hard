
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




#  問2
#
# ジャンプ機能をもつロボットがあります。そのロボットは、1回のジャンプあたり1メートル、2メートル、もしくは3メートルの距離を進むことができます。
#
# 長さnメートルの距離をジャンプで移動する場合、何通りのジャンプの組み合わせで移動できるか求めるプログラムを作成してください。
#
# また、プログラムはnの値が大きくても十分に高速になるような実装としてください。


# n % 3 = x
# 2 or 1


## 問1

# ユーザID、ユーザ名、ユーザと友人関係にあるユーザIDの配列をJSON形式で返すWeb APIがあります（仕様は後述）。
#
# あるユーザIDを与えたときに、そのユーザの友人、および友人の友人の名前を出力するプログラムを作成してください。
#
# なお、プログラムはオブジェクト指向プログラミングで設計し、実装してください。
#
#
#
# - Web API（実際にアクセス可能です）
#
#    -
#
# http://fg-69c8cbcd.herokuapp.com/user/1
#
#    - 上記URLの最後の1の部分がユーザIDで、別のユーザIDを指定することで、そのユーザの情報取得が可能
#
# - レスポンス例
#
#  - {"id":1, "name":"Austin", "friends":[2,5]}
#
#  - id … ユーザID
#
#  - name … ユーザ名
#
#  - friends … ユーザと友人関係にあるユーザIDの配列

import requests


def get_data(id):
    data = requests.get('http://fg-69c8cbcd.herokuapp.com/user/' + str(id))
    return data.json()


def get_friends(json):

    friends = json['friends']

    return friends


def print_friend_name(f):
        print(f['name'])


def print_friend_name_until_second_step(id, step = 1):
    if step == 3:
        return

    data = get_data(id)
    fs = get_friends(data)

    for f_id in fs:
        f = get_data(f_id)
        print_friend_name(f)
        print_friend_name_until_second_step(f_id, step + 1)
#
# if __name__ == '__main__':
#     print_friend_name_until_second_step(1)
#


def x(n, carr = 0):

    if n <= 0:
        return carr

    two = 2
    tree = 3

    t_r = n - two
    tr_r = n - tree
    if t_r < 0:
        return carr
    elif t_r == 0:
        return 1
    else:
        carr += (t_r + 1)
        carr += x(t_r, carr)

    if tr_r <= 0:
        return carr
    elif t_r == 0:
        return 1
    else:
        carr += (tr_r + 1)
        carr += x(tr_r, carr)

    return carr + 1


 # default -> n % 1 의 경우의 수 1
 # max = n / 1
 # n - 2 % 1 / 1
 # n - 3 % 1 /
 # if 0 => 1
 # if n % 2 == 0 -> 1
 # if n % 3 == 0  -> 1

def findNumSols_slow(n, k = 3):
    if k == 1:  # 변수가 한개만 남았을 경우 1가지만 가능하므로 1을 리턴합니다.
        return 1
    count = 0  # 카운터 변수를 초기화 시키고,

    # a_1이 가능한 0에서 n까지 반복하여 값을 대입하면서 recursive call을 합니다.
    for i in range(1, n + 1):
        count += findNumSols_slow(n - i, k - 1)
    return count

if __name__ == '__main__':
    print(findNumSols_slow(3) + 1)


# 3 1
#
#
# 2 2
#
# 1 3