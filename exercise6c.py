x = 100
for number in range(2,x):
    if all(number%i!=0 for i in range(2,number)):
       print (number)