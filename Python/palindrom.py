number=int(input("Enter a number: "))
original=number
reversed=0

while number!=0:
    remainder=number%10
    reversed=reversed * 10 + remainder
    number=number//10
    
    
if original==reversed:
    print("The number is a palindrome!")
else:
    print("The number isn't a palindrome!")
