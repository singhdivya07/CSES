# -*- coding: utf-8 -*-
"""
Created on Mon Jul  6 00:40:17 2020

@author: HP
"""
def main(s):
    
#s = input()
    count = 0
    max=0
    for a in range(len(s) -1):
        if s[a]==s[(a+1)]:
            count=count+1
            if max < count:
                max =count
        elif s[a]!=s[a+1]:
            count = 0
    print(max+1)
    

if __name__== "__main__":
    s = list(input())
    main(s)