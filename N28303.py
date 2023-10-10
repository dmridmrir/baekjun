N,K = input().split()
num = input().split()
energy1= 0
energy2 = 0
max1 = 0
max2 = 0

for i in range(0,int(N)):
    for j in range(i+1,int(N)):
        energy1 = int(num[j]) - int(num[i]) - abs((j-i))*int(K)
        if max1 ==0:
            max1 = energy1
        elif energy1 > max1:
            max1 = energy1
for i in range(0,int(N)):
    for j in range(i+1,int(N)):
        energy2= int(num[i]) - int(num[j]) - abs((i-j))*int(K)
        if max2 ==0:
            max2 = energy2
        elif energy2 > max2:
            max2 = energy2
if max1 > max2 :
    print(max1)
else:
    print(max2)