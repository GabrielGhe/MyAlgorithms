def selectionsort(lst):
    #go in reverse from last index to first
    for passes in range(len(lst) - 1, 0, -1):
        posOfMax = 0                    #default is pos 0                    
        for i in range(1, passes+1):    #go from ]0,passes], find max and place it
            if lst[i] > lst[posOfMax]:  #at index passes
                posOfMax = i
        swap(lst, passes, posOfMax)
    return lst

def swap(lst, i, j):
    temp = lst[i]
    lst[i] = lst[j]
    lst[j] = temp
    
print "{0}".format( selectionsort([23,57,75,33,6,8,56]) )
