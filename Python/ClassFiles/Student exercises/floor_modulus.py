#write the divide() function
def divide(n, d):
  div = n // d
  remander = n % d
  print(n, "divided by", d, "equals", div, "with a remainder of", remander, sep=" ")
    
def main():
    numerator = 5
    denominator = 2
    divide(numerator,denominator)

main()
