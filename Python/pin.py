def validate_pin(pin):
    if len(pin)==4 or len(pin)==6:
        print ("True")
    else:
        print("Flase")

validate_pin("1234")
validate_pin("12345")
validate_pin("123456")