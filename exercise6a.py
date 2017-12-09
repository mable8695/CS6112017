def is_prime(a):
    

	return all(a % i for i in range(2, a))



if (("%d" % (is_prime(13))) == 1):

	print("Prime")

else:

	print("Not Prime")