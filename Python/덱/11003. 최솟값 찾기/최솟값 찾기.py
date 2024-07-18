from collections import deque

n, l = map(int, input().split())
num = list(map(int, input().split()))

deque = deque()
for i in range(n):
    while deque and deque[-1][0] > num[i]: # 덱의 우측부터 입력받는 요소보다 정수가 큰 요소 모두 제거
        deque.pop()                        # 덱 안에서 오름차순으로 정렬이 되고, 동시에 비교할 정수가 적어져 연산 시간 절약
    deque.append((num[i], i)) # 데이터, 인덱스
    if deque[0][1] <= i - l:
        deque.popleft()
    print(deque[0][0], end=' ')