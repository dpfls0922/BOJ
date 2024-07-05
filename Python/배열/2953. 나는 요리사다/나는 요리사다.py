all_score = []

for i in range(5):
    scores = list(map(int, input().split()))
    all_score.append(sum(scores))

print(all_score.index(max(all_score)) + 1, max(all_score))