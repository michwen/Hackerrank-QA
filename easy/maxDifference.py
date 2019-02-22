# maximum difference in an unordered array, a[i]<a[j], i<j

def maxDiff(a):
    
    ourMin = a[0]
    ourMaxDiff = -1
     
    for x in range( len(a) ): 
        if (a[x] < ourMin):
            ourMin = a[x]
        if (a[x] - ourMin > ourMaxDiff):
            ourMaxDiff = a[x] - ourMin 
            
    return ourMaxDiff
