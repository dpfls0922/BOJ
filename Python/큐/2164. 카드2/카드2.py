from collections import deque

n = int(input())
cards = deque([i + 1 for i in range(n)])

while True:
    if len(cards) == 1:
        break
    cards.popleft()
    cards.append(cards.popleft())
print(cards[0])