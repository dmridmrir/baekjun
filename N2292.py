N = int(input())
layer = 1
now = 1

while(N > now):
    now += layer*6
    layer+=1

print(layer)