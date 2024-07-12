// 시간 초과
n = int(input())
heights = input().split()
answer = []

while heights:
    high = 0
    height = heights.pop()
    for i in range(len(heights)-1, -1, -1):
        if height <= heights[i]:
            high = 1
            answer.append(i + 1)
            break
    if high == 0:
        answer.append(0)
    
answer.reverse()
print(answer)