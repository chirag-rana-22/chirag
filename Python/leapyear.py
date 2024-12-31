year=int(input("Enter the Year="))

if year%400==0 and year%100==0 or year%4==0 and year!=100:
    print("Year is leap")
else:
    print("Year is not leap")