n = int(input())
nums = list(map(int, input().split()))
answer = [-1] * n

stack = []
for i in range(n):
    while stack and nums[i] > nums[stack[-1]]:
        answer[stack[-1]] = nums[i]
        stack.pop()
    stack.append(i)

print(' '.join(map(str, answer)))