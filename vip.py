print ("hello, python");

# booleans
true_boolean = true
false_booleans = false

if True:
	print "True"
else:
	print "False" 
one = 1
two = 2
some_number = 10000


# string
my_name = "Brian Karsann";


if True: 
	print("Hello Python If")
if 2 > 1:
	print ("2 is greater than 1")
if 1 > 2:
	print("1 is greater than 2")
else: 
	print("1 is not greater than 2")
	
	
if 1 > 2: 
	print("1 is greater than 2")
elif 2 > 1:
	print ("1 is not greater than 2")
else: 
	print ("1 is equal to 2")
num = 1

while num <= 10:
	print(num)
	num += 1

loop_condition = True

while loop_condition:
	print ("Loop Condition keeps: %s" %(loop_condition))
	loop_condition = False
	
for i in range(1, 11):
	print(i)
	
my_integers = [1, 2, 3, 4, 5]

my_integers = [5, 7, 1, 3, 4]
print(my_integers[0]) 
print(my_integers[1]) 
print(my_integers[4])

relatives_names = [
	"Toshiaki",
	"Yuji", 
	"Bruno",
	"Kaio",
]


print(relatives_names[4]) 


bookshelf = []
bookshelf.append("The Effective Engineer")
bookshelf.append("The 4 Hour Work Week")
bookshelf.append("DJ Khaled, The Keys")

print(bookshelf[0])
print(bookshelf[1])
print(bookshelf[2])


dictionary_example = {
	"key1": "value1",
	"key2": "value2",
	"key3": "value3",
}


dictionary_tk = {
	"name": "Brian",
	"nickname": "ManBearPig",
	"nationality": "American",
	"age": "21",
}


print("My name is %s" %(dictionary_tk["name"]))


print("But you can call me %s" %(dictionary_tk["nickname"]))

print("And by the way I'm %s" %(dictionary_tk["nationality"]))


dictionary_tk['age'] = 21


print(dictionary_tk) 


bookshelf = [
	"The Effective Engineer",
	"The 4 hours work week",
	"Zero to One",
	"Lean Startup",
	"Hooked"
] 


for book in bookshelf:
	print(book)
	

dictionary = { "some_key": "some_value"}

for key in dictionary:
	print("%s --> %s" %(key, dictionary[key]))
	
	
dictionary_tk = {
	"name": "Brian",
	"nickname": "ManBearPig",
	"nationality": "American",
	"age": 21
}


for attribute, value in dictionary_tk.items():
	print("My %s is %s" %(atttribute, value))
	

class Vehicle:
	pass
	

car = Vehicle()
print(car) 

class Vehicle:
	def __init__(self, number_of_wheels, type_of_tank, seating_capacity, maximum_velocity):
	self.number_of_wheels = number_of_wheels
	self.type_of_tank = type_of_tank
	self.seating_capcity = seating_capacity
	self.maximum_velocity = maximum_velocity 
	


tesla_model_s = Vehicle(4, 'electric', 5, 250)


def number_of_wheels(self):
	return self.number_of_wheels
	
def set_number_of_wheels(self, number):
	self.number_of_wheels = number 
	

class Vehicle: 
	def __init__(self, number_of_wheels, type_of_tank, seating_capacity, maximum_velocity):
	self.number_of_wheels = number_of_wheels
	self.type_of_tank = type_of_tank
	self.seating_capacity = seating_capacity
	self.maximum_velocity = maximum_velocity
	
	@property
	def number_of_wheels(self):
		return self.__number_of_wheels
	
	@number_of_wheels.setter
	def number_of_wheels(self, number):
		self.__number_of_wheels = number 
	
# Python 

print('Hello World!')



