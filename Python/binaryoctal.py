decimal_number=int(input("Enter the decimal Number="))

def convert_number(number):
    binary=bin(number)
    octal=oct(number)
    hexadecimal=hex(number)

    print("Binary:" +binary)
    print("Octal:" +octal)
    print("Hexadecimal:" +hexadecimal)

convert_number(decimal_number)
    