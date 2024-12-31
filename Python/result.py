
total=0
i=1
while i<=5:
    marks=int(input("Enter the Subject" +str(i)+ "marks="))
    i=i+1

    total+=marks

percentag=float(total/5)

def studentresult(per):
    if per>=70:
        print("Distriction")
    elif per>=60 and per<70:
        print("First class")
    elif per>=50 and per<60:
        print("Second class")
    elif per>=40 and per<50:
        print("Pass class")
    else:
        print("Fail")


    
print(total)
print(percentag)
studentresult(percentag)
