def main():
    phrase = input("Choose a phrase: ")
    print("Your phrase is ", phrase, "'", sep="")
    start = int(input("Which character would you like to start with? [Enter number] "))
    end = int(input("Which character would you like to end with? [Enter number] ")) + 1
    print("Your substring is '", phrase[start:end], "'", sep="")

def alt_main():
    phrase = input("Choose a phrase: ")
    print("Your phrase is ", phrase, "'", sep="")
    start = int(input("Which character would you like to start with? [Enter number] ")) - 1
    end = int(input("Which character would you like to end with? [Enter number] "))
    print("Your substring is '", phrase[start:end], "'", sep="")

main()
alt_main()
