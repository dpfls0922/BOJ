from collections import deque
import sys

input = sys.stdin.readline
t = int(input())
for i in range(t):
    function = input().strip()
    n = int(input())
    num_list = input().strip()[1:-1]

    if n > 0:
        num_list = num_list.split(',')
    else:
        num_list = []

    num = deque(num_list)
    is_reversed = False
    has_error = False

    for p in function:
        if p == 'R':
            is_reversed = not is_reversed
            # num.reverse() <- 시간 복잡도 증가
        elif p == 'D':
            if num:
                if is_reversed:
                    num.pop()
                else:
                    num.popleft()
            else:
                has_error = True
                break

    if has_error:
        print('error')
    else:
        if is_reversed:
            num.reverse()
        print('[' + ','.join(num) + ']')