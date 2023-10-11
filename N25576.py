import sys
input = sys.stdin.readline

N,M = map(int,input().split())
ral = list(map(int,input().split()))
good = 0
bad = 0

for i in range(1,N):
    another = list(map(int,input().split()))
    sum = 0
    for j in range(0,M):
        sum += abs(ral[j] - another[j])
    if sum > 2000:
        bad += 1
    else:
        good += 1

if bad >= good:
    print("YES")
else:
    print("NO")