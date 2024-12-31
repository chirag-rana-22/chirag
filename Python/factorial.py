
Number=int(input("Enter the Number="))

def factorial(num):
    fact=1
    i=1
    while i<=num:
         fact=fact * i
         i=i+1

    print(fact)

factorial(Number)

