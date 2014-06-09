def heapsort(lst):
    makeListIntoHeap(lst)
    makeHeapIntoSortedList(lst)
 
def makeListIntoHeap(lst):
    #go from ]0, size] inserting into heap
    for i in range(1, len(lst)):
        goodPos = False
        index = i#upheap while it's not the root or at right place
        
        while (index != 0) and (not goodPos):#stop if (index == 0) or (goodPos)
            parent = int( (index - 1)/ 2)
            if lst[index] > lst[parent]:#if parent is smaller, swap
                swap(lst, index, parent)
                index = parent
            else:
                goodPos = True

def makeHeapIntoSortedList(lst):
    for size in range(len(lst)-1, 0, -1): #remove all elements and downheap
        swap(lst, 0, size)#swap first and last (removing biggest)
        goodPos = False
        inRange = True
        index = 0
        
        while not goodPos and inRange: #downheap
            leftChild = (2*index) + 1
            rightChild = (2*index) + 2
            
            if leftChild > (size-1):
                inRange = False
            elif rightChild > (size-1):
                biggestChild = leftChild
            else:
                biggestChild = leftChild if ( lst[leftChild] > lst[rightChild] ) else rightChild
            
            if inRange: 
                if lst[index] < lst[biggestChild]:
                    swap(lst, index, biggestChild)
                    index = biggestChild
                else:#index is bigger than its children
                    goodPos = True

def swap(lst, i, j):
    temp = lst[i]
    lst[i] = lst[j]
    lst[j] = temp

lst = [23,57,75,33,6,8,56]
heapsort(lst)
print "{0}".format(lst)
