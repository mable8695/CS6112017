import re
h = open("D:\\emails.txt", "r") 
f1 = h.read()
k = re.findall(r'(\w(?:[-.+]?\w+)+\@(?:[a-zA-Z0-9](?:[-+]?\w+)*\.)+[a-zA-Z]{2,})', f1)
for j in k:
	print(j)
