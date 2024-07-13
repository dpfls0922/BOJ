n = int(input())
towers = list(map(int, input().split()))
answer = [0] * n
stack = []

for i in range(n):
    while stack:
        if towers[i] >= towers[stack[-1]]:
            stack.pop()
        else:
            answer[i] = stack[-1] + 1
            break
    stack.append(i) # 스택에 높이가 큰 타워의 인덱스 담아놓기

print(' '.join(map(str, answer)))

# 시간 초과

# while heights:
#     high = 0
#     height = heights.pop()
#     for i in range(len(heights)-1, -1, -1):
#         if height <= heights[i]:
#             high = 1
#             answer.append(i + 1)
#             break
#     if high == 0:
#         answer.append(0)
    
# answer.reverse()