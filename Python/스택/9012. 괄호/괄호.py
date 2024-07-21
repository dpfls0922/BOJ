import sys

input = sys.stdin.readline

n = int(input())
for i in range(n):

    valid = True
    stack = []
    braces = input().strip()
    for j in range(len(braces)):
        if braces[j] == '(':
            stack.append('(')
        else:
            if stack and stack[-1] == '(':
                stack.pop()
            else:
                valid = False
                break

    if stack or valid == False:
        print('NO')
    else:
        print('YES')