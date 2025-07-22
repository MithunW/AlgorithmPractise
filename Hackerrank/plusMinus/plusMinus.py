n = int(input().strip())
arr = list(map(int, input().strip().split()))
pos = 0
neg = 0
zero = 0

for i in range(n):
    if arr[i] > 0:
        pos += 1
    elif arr[i] < 0:
        neg += 1
    else:
        zero += 1
print(f"{pos/n:.6f}")
print(f"{neg/n:.6f}")
print(f"{zero/n:.6f}")

# The code reads an integer n and a list of n integers, then calculates the proportions of positive, negative, and zero values in the list.
# It prints these proportions formatted to six decimal places.
# We can use dictionary to store counts and simplify the code further. but as there is only three categories, it is not necessary.
# However, if you want to use a dictionary, it can be done as follows:
# counts = {'positive': 0, 'negative': 0, 'zero': 0