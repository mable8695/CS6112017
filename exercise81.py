def set_first_elem_to_zero(x):
	x[0]=0
	return x

list1 = [1 , 2 , 3]
z=set_first_elem_to_zero(list1)
print (z)
print (list1) #Orignal list also changes
