from collections import deque
import sys

n = int(input())
num = deque()
for i in range(n):
    cmd = sys.stdin.readline().strip().split()
    action = cmd[0]
    if action == 'push_front':
        num.appendleft(cmd[1])
    elif action == 'push_back':
        num.append(cmd[1])
    elif action == 'pop_front':
        print(num.popleft() if num else -1)
    elif action == 'pop_back':
        print(num.pop() if num else -1)
    elif action == 'front':
        print(num[0] if num else -1)
    elif action == 'back':
        print(num[-1] if num else -1)
    elif action == 'size':
        print(len(num))
    elif action == 'empty':
        print(0 if len(num) else 1)