from collections import deque

n = int(input())
commands = [input().split() for _ in range(n)]

num = deque()
for cmd in commands:
    action = cmd[0]
    if action == 'push':
        num.append(cmd[1])
    elif action == 'pop':
        print(num.popleft() if num else -1)
    elif action == 'size':
        print(len(num))
    elif action == 'empty':
        print(0 if num else 1)
    elif action == 'front':
        print(num[0] if num else -1)
    elif action == 'back':
        print(num[-1] if num else -1)