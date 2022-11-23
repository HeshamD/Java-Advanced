Use the State Pattern to create a modern vending machine that does the following things:
It sells different kinds of fruit
It has the following states:
card swiped accepted
card swiped rejected
item selected
sold
sold out
each state has the following operations
swipe card
select item
confirm
cancel
dispense
Components:
Vending Machine (The state machine that has multiple states) - VendingMachine
State (The interface that defines all operations that each state should have) - State
Concrete Interfaces.States (All possible states of the vending machine) - CardSwipedAcceptedState, CardSwipedRejectedState, ItemSelectedState, SoldState, SoldOutState.
Client (The user who uses the vending machine) - App
Tips
A key-value pair like data structure could be used to keep track of the inventory of the vending machine.
The state machine needs to keep its internal state.
some mock helper methods could be used to print out generic invalid operation errors and validate cards.


Questions to discuss
What are the common use cases to apply a State Pattern?
What needs to be done if multiple instances of the vending machine are instantiated?
move concrete state instances to shared static instances.
instead of passing in an instance of vending machine from the state constructor, passing the reference when each state operation is called.