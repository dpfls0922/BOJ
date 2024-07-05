n = int(input())
test_cases = [input() for i in range(n)]

for tc in test_cases:
    cnt = 0
    sum = 0
    for c in tc:
        if c == 'O':
            cnt += 1
            sum += cnt
        elif c == 'X':
            cnt = 0
    print(sum)