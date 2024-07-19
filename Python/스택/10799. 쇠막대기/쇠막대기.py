import sys

input = sys.stdin.readline

answer = 0
stack = []
brackets = input().strip()  # 개행 문자 제거

for i in range(len(brackets)):
    if brackets[i] == '(':
        stack.append('(')
    else:
        if brackets[i - 1] == '(': # 레이저 만남
            stack.pop()
            answer += len(stack) # 현재 쇠막대기 카운트
        else: # 쇠막대기의 끝을 만남
            stack.pop()
            answer += 1

print(answer)
