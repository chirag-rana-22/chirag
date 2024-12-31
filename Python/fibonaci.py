number=int(input("Enter a number: "))
n1,n2=0,1
count=0

if number<=0:
    print("Please Enter the Positive Number")

else:
    print("Fibonnci Sequence")
    while count<number:
        print(n1)
        temp=n1+n2
        n1=n2
        n2=temp
        count+=1
        



