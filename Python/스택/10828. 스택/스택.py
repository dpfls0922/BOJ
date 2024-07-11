n = int(input())

commands = [input().split() for _ in range(n)]

num = []
for cmd in commands:

    action = cmd[0]
    if action == 'push':
        num.append(cmd[1])
    elif action == 'pop':
        print(num.pop() if num else -1)
    elif action == 'top':
        print(num[-1] if num else -1)
    elif action == 'size':
        print(len(num))
    elif action == 'empty':
        print(0 if num else 1)