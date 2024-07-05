from sys import stdin

n = int(stdin.readline().strip())

for _ in range(n):
    origin = list(stdin.readline().rstrip())
    left = []
    right = []

    for c in origin:
        if c == '<':
            if left:
                right.append(left.pop())
        elif c == '>':
            if right:
                left.append(right.pop())
        elif c == '-':
            if left:
                left.pop()
        elif c.isalnum():  # 숫자나 알파벳인 경우
            left.append(c)
    
    print(''.join(left + right[::-1]))
