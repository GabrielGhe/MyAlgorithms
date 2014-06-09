import random

def quicksort(intList):
    _quicksort(intList, 0, len(intList) - 1)
    

def _quicksort(intList, first, last):
    if first < last:
        pivot = partition(intList, first, last) #partition and get pivot
        _quicksort(intList, first, pivot - 1) #sort first half
        _quicksort(intList, pivot + 1, last) #sort second half
 
      
def partition(intList, first, last):
    pivot = first + random.randrange( last - first + 1) #generate pivot
    swap(intList, pivot, last) #put the pivot at the end
    
    #go through the range first to last
    for i in range(first, last):
        if intList[i] <= intList[last]:
            swap( intList, i, first )
            first += 1

    swap(intList, first, last)
    return first


def swap(A, b, c):
    tmp = A[b]
    A[b] = A[c]
    A[c] = tmp
    

x = [1,6,3,6,8,3,2,6,8,9]
print "Initially {0}".format(str(x))
quicksort(x)
print "After {0}".format(str(x))
