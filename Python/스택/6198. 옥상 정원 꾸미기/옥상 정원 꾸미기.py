n = int(input())
towers = [int(input()) for _ in range(n)]

stack = []
sum = 0
for i in range(n):
    while stack and towers[i] >= towers[stack[-1]]:
        stack.pop()
    sum += len(stack)
    stack.append(i)

print(sum)

# 문제 풀이
# 1) 왼쪽에서 오른쪽으로 towers를 순회하면서,현재 빌딩 i의 높이보다 낮거나 같은 빌딩들은 스택에서 제거한다.
#    이는 이 빌딩(제거된 빌딩)이 더 이상 다른 빌딩에서 볼 수 없기 때문이다.
# 2) 스택에 남아있는 빌딩의 수를 sum에 누적한다.
#    스택에 남이있는 빌딩들은 현재 빌딩(i)보다 높기 때문에, 스택에 남아있는 빌딩들은 아직 옥상을 볼 수 있다.

# 시간 초과
# n = int(input())
# towers = [int(input()) for _ in range(n)]
# answer = [0] * n

# for i in range(n):
#     for j in range(i + 1, n):
#         if towers[i] > towers[j]:
#             answer[i] += 1
#         else:
#             break

# print(sum(answer))