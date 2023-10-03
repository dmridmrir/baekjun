# 거스름돈의 액수가 주어지면 리암이 줘야할 쿼터(Quarter, $0.25)의 개수, 
# 다임(Dime, $0.10)의 개수, 니켈(Nickel, $0.05)의 개수, 
# 페니(Penny, $0.01)의 개수를 구하는 프로그램을 작성하시오. 거스름돈은 항상 $5.00 이하이고, 
# 손님이 받는 동전의 개수를 최소로 하려고 한다. 예를 들어, $1.24를 거슬러 주어야 한다면, 손님은 4쿼터, 2다임, 0니켈, 4페니를 받게 된다.

Q,D,N,P = 25,10,5,1

T = int(input('테스트 할 횟수 입력 :'))

for i in range(0,T):
    coin = []
    count = 0
    C = int(input('거스름 돈C 입력(1 <= C <= 500)'))

    while (C>Q):
        C -= Q
        count += 1
    coin.append(count)
    count = 0
    while C>D:
        C -= D
        count += 1
    coin.append(count)
    count = 0
    while C>N:
        C -= N
        count += 1
    coin.append(count)
    count = 0
    while C>=P:
        C -= P
        count += 1
        print(C)
        print(P)
    coin.append(count)
    print(coin)

