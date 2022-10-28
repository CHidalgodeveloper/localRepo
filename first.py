lst = [10, 12, 3, 41, 15]
long=len(lst)
for j in range(long-1):
    for i in range (long-1):
        if lst[i]>lst[i+1]:
            lst[i],lst[i+1]=lst[i+1],lst[i]

print(lst)
