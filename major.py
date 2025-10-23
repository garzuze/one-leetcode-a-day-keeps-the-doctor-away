def main(nums):
    target = len(nums) / 2
    for num in set(nums):
        if nums.count(num) >= target:
            return num
print(main([2,2,1,1,1,2,2]))