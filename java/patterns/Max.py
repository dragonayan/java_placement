# def reverse(arr):
#     print(arr.split()[::-1]) 

# ans=reverse("my name is")
def print_pattern(n):
    for i in range(1, 2*n):
        if i <= n:
            stars = '*' * i
        else:
            stars = '*' * (2*n - i)
        print(stars)

# Test cases
print_pattern(3)

