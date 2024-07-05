str = input()

position = [-1 for _ in range(26)]

for i, s in enumerate(str):
    if position[ord(s) - ord('a')] == -1:
        position[ord(s) - ord('a')] = i

for i in position:
    print(i, end=' ')