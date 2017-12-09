x=float(123)

print(x)
	
output:123.0	



x=float('123')

print(x)	

output:123.0



x=float('123.23')

print(x)	

output:123.23



x=int(123.23)

print(x)	

output:123



#x=int('123.23')

#print(x)	

output:ValueError: invalid literal for int() with base 10: '123.23'



x=int(float('123.23'))

print(x)	

output:123



x=str(12)

print(x)	

output:12



x=str(12.2)

print(x)	

output:12.2



x=bool('a')

print(x)	

output:True



x=bool(0)

print(x)	

output:False



x=bool(0.1)

print(x)	

output:True