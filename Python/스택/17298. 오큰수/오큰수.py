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

# 문제 풀이
# 1) 오큰수는 자신보다 큰 값을 가진 오른쪽에서 가장 가까이 위치한 값이다.
# 2) stack에는 오큰수를 지정하지 못한 숫자의 인덱스가 들어간다.
# 3) for문으로는 nums를 하나씩 순회하고(-> 방향), while stack에서는 오큰수를 찾지 못한 값들을 순회한다(<-).
# 4) nums를 순회하는 값(nums[i])과 오큰수를 찾지 못한 값(nums[stack[-1]])과 크기 비교하면서 오큰수를 지정해준다. 없으면 기본으로 값이 -1이 된다.