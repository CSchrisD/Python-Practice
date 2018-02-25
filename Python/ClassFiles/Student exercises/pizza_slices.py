import math

def calc_slices(people, slices_per_person):
    return people * slices_per_person

def calc_pizzas(slices, slices_per_pie):
    return math.ceil(slices / slices_per_pie)

def calc_slices_remain(slices_per_pie, pizzas, slices_needed):
    total_slices = slices_per_pie * pizzas
    return total_slices - slices_needed

def main():
    num_people = int(input("How many people are eating? "))
    num_slices = float(input("How many slices per person? "))
    num_slices_per_pie = int(input("How many slices per pie? "))

    slices = calc_slices(num_people, num_slices)
    pizzas = calc_pizzas(slices, num_slices_per_pie)
    slices_left = calc_slices_remain(num_slices_per_pie, pizzas, slices)
    
    print("You need", pizzas, "pizzas to feed", num_people, "people.")
    print("There will be", slices_left, "leftover slices.")
   
main()
