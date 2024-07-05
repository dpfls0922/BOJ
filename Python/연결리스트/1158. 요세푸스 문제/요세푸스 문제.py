from sys import stdin

n, k = map(int, input().split())
person = [i for i in range(1, n + 1)]
answer = []

index = 0
while person:
    index = (index + k - 1) % len(person)
    answer.append(person[index])
    person.remove(person[index])

print("<" + ", ".join(map(str, answer)) + ">")