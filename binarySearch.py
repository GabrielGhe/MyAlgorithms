def binarySearch(aList, val):
    low = 0
    high = len(aList)
    
    while low <= high:
        mid = (high + low) / 2
        if aList[mid] > val:
            high = mid - 1 # Value is smaller than the middle
        elif aList[mid] < val:
            low = mid + 1 # Value is bigger than middle
        else:
            return mid
    return -1

x = [1, 2, 3, 4, 5, 6, 7, 8, 9]
print "Searching in {0}".format(str(x))
result = binarySearch(x, 7)
print "The result is index {0}".format(result)
