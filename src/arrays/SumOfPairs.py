
def sumOfPairs(nums,sum):
    first = 0
    last = len(nums)-1
    
    found = False
    
    while not found and first<last:
        if nums[first] + nums[last] == sum:
            found = True
        elif nums[first] + nums[last] > sum:
            last -= 1
        else:
            first += 1   
    if found:
        print("found at index {}, {}".format(first,last))
    else:
        print('Not Found')

nums =  [3, 5, 5, 10, 15, 17, 20 ]
sumOfPairs(nums, 20)  