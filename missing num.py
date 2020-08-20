# -*- coding: utf-8 -*-
"""
Created on Sun Jul  5 22:25:21 2020

@author: HP
"""
def main(n):
    t = list(map(int,input().split(" ")))
    a = n*(n+1)//2
    b= sum(t)
    c = a-b
    print(c)
    
if __name__== "__main__":
    n = int(input())
    main(n)