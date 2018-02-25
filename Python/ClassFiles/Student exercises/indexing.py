def main():
    phrase = input("Choose a phrase? ")
    print("Your phrase is '",phrase, "'", sep=" ")
    index = int(input("Which character would you like to see? [Enter number] "))
    print("Character number", index, "is", phrase[index], sep=" ")

def alt_main():
    phrase = input("Choose a phrase? ")
    print("Your phrase is '",phrase, "'", sep=" ")
    pos = int(input("Which character would you like to see? [Enter number] ")) - 1
    print("Character number ", pos + 1, " is '", phrase[pos], "'", sep="")
    
main()
alt_main()
