start = 0

for i in range(0,10):
    inst = int(input())

    if(inst == 1):
        start += 1
    elif(inst == 2):
        start += 2
    else:
        start -= 1
    
    if(start > 3):
        start -= 4
    elif(start < 0):
        start += 4

if(start == 0):
    print("N")
elif(start == 1):
    print("E")
elif(start == 2):
    print("S")
else:
    print("W")