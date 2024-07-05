n = int(input())
maps = [list(map(int, input())) for i in range(n)]

# 상하좌우
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

# 좌표 (x, y)가 유효하고, 방문하지 않았으며, 집이 있을 때 탐색
def dfs(x, y):
    if x < 0 or x >= n or y < 0 or y >= n or maps[x][y] == 0:
        return 0
    
    # 방문 노드 표시
    maps[x][y] = 0
    count = 1

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[
            i]
        count += dfs(nx, ny)
    return count

# 전체 탐색 및 결과 저장
result = 0
count_list = []

for i in range(n):
    for j in range(n):
        if maps[i][j] == 1:
            count = dfs(i, j)
            count_list.append(count)
            result += 1

print(result)
count_list.sort()
for c in count_list:
    print(c)