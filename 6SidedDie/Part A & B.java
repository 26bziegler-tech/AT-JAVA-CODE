Part A
The Die class interacts with external objects through a particular set of public methods that determine how a die works 
and how it can be accessed. The main functional method is roll(), which employs Math.random() to produce a random integer 
from 1 to 6 and updates the die’s internal state accordingly. In order to visualize how a die looks in a physical sense, 
a display() method is used to print a text-based representation of a die’s current status on the screen. The class has a 
default constructor to set a die’s initial status from a base value, as well as an overloaded constructor in which a programmer 
can set a die’s initial status when creating a die object.

Part B 
The data model for the virtual die is simple and efficient in its use of a single instance variable in the class definition to hold the state of 
the object. The variable, an integer type named Value, stores the current face-up value of the die (ranging from 1 to 6). The declaration of 
the variable as private ensures that the value of the die is not tampered with by any other class. The state of the die changes only through 
the roll() method's controlled logic or during the construction of the object, thus emulating the behavior of a physical object.