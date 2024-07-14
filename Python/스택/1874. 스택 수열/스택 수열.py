n = int(input())

stack = []
answer = []

current = 1
is_possible = True
for i in range(n):
    num = int(input())
    while num >= current:
        stack.append(current)
        answer.append('+')
        current += 1
    if stack and stack[-1] >= num:
        stack.pop()
        answer.append('-')
    else:
        is_possible = False
        break

if is_possible:
    print('\n'.join(answer))
else:
    print('NO')