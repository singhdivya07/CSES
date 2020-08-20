# -*- coding: utf-8 -*-
"""
Created on Tue Jul  7 13:27:54 2020

@author: HP
"""

# -*- coding: utf-8 -*-
n= int(input())
lst=[int(i) for i in input().split()]
count =0
for i in range(1,n):
    if lst[i]<lst[i-1]:
        count = count + (lst[i]-lst[i-1])
        lst[i]=lst[i-1]
print(abs(count))
        

    


