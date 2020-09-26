x=0
while(x<10000 or x>99999):
	x=int(input())
r=x%100
x=x//100
d=x%10
x=x//10
x=(d*10000+(x*100+r))*10+d
print(x)
