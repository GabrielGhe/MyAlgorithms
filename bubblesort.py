def bubblesort(lst):
    #from last index to second
    for passes in range(len(lst) - 1, 0, -1):
        #from [0,passes[ keep swapping to put the largest
        #number at index passes
        for i in range(passes):
            if lst[i] > lst[i+1]:
                swap(lst, i, i+1)
    return lst
            
def swap(lst, i, j):
    temp = lst[i]
    lst[i] = lst[j]
    lst[j] = temp
    
print "{0}".format(bubblesort([23,57,75,33,6,8,56]))
