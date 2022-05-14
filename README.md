# Team Project (Code Brewers)

## Topic

This project is about a game developed in Greenfoot named **DodgeCar** in which the user plays as a GreenCar avoiding obstacles such as RedCars and collecting lifelines on the way in order to score the highest.

## Project Videos
* [DodgeCars Ad](https://www.youtube.com/watch?v=-XvKhaJkzIw)
* [DodgeCars Demo](https://www.youtube.com/watch?v=r65_u66P2Ws)
## Team Members

* [Akash Amin](https://github.com/akashamin01)
* [Haard Shah](https://github.com/haard19)
* [Ronak Prajapati](https://github.com/ronak0001)
* [Shivang Patel](https://github.com/shivangpatel24)

## Weekly Journals

* [Akash Amin](https://github.com/nguyensjsu/sp22-202-code-brewers/blob/main/weekly%20journals/Akash%20Amin.md)
* [Haard Shah](https://github.com/nguyensjsu/sp22-202-code-brewers/blob/main/weekly%20journals/Haard%20Shah.md)
* [Ronak Prajapati](https://github.com/nguyensjsu/sp22-202-code-brewers/blob/main/weekly%20journals/Ronak%20Prajapati.md)
* [Shivang Patel](https://github.com/nguyensjsu/sp22-202-code-brewers/blob/main/weekly%20journals/Shivang%20Patel.md)

## XP Core Values

| Name            | XP Core Values      |
| :----           | :----               |  
| Akash Amin      | Courage             |
| Haard Shah      | Feedback & Respect  |
| Ronak Prajapati | Communication       |
| Shivang Patel   | Simplicity          | 

## Summary of the project

DodgeCar is a game developed using a JAVA based platform named Greenfoot which helps in creating innovative games using simple JAVA code base. The game revolves around the user playing as a green car avoiding obstacles as they come in the way. The obstacles are of 2 types: Red Car and Lifeline. The goal is to avoid crashing into red cars and collecting lifelines in order to score the highest before losing all your health.

At the start of each level, the user is provided with 4 health points. The health points reduce by 1 with every crash into a red car and it can incremented by the same amount when Lifeline is collected to a maximum cap of 4. The score is calculated as per the count of red cars passed till the user has no health points left to play further.

Here are a few screenshots of the gameplay:

### Main Screen
![alt text](./images/mainScreen.png?raw=True)

### Game Screen 
![alt text](./images/Level1-2.png?raw=True)

### Exit Screen
![alt text](./images/ExitScreen.png?raw=True)

## High Level Diagrams

### UI WireFrame
![alt text](./images/UI_Wireframe.png?raw=True)

### Component Diagram
![alt text](./images/dodgeCarComponentDiagram.png?raw=True)

### Class Diagrams for each Design Pattern Implemented

1. **Singleton** by Shivang Patel
![Singleton Pattern Image](./images/SingletonDesignPattern.png?raw=True)
- A single instance of the classes GreenCar and Score is shared by the whole application.
- The reason for doing this is to manage the greencar/user (health) and score attributes of the game. There is going to be only one user/GreenCar and one scoreboard that are affected by multiple obstacles.
- To implement this, static instances of the classes were created which were then accessed using getInstance() method of the particular classes and thus managing a single object. 

2. **Command** by Shivang Patel
![Command Pattern Image](./images/CommandDesignPattern.png?raw=True)
- The GreenCar is managed using interactions by the user given from the keyboard i.e. left or right movements.
- These inputs were implemented by viewing them as commands from the user.
- **IKeyboardCommand** defines a set of methods that needs to be implemented by a KeyboardCommand.
- **IKeyboardReceiver** defines a set of methods that need to be implemented by a receiver which is resposnsible to call the actual action that needs to be executed on an input. (what logic/code adjustments should happen on the left/right press)
- **KeyboardCommand** implements the IKeyboardCommand interface and is responsible for calling the specific receiver (IKeyboardReceiver) as per the input given by the user.
- **IKeyInputInvoker** defines a set of methods that a KeyInputMenuItem implements.
- **KeyInputMenuItem** implements the IKeyInputInvoker interface and is responsible for calling the specific command (KeyboardCommand) as per the input given by the user. It acts as a container of a command which eventually passes it to the correct receiver that can handle it.
- **KeyInputMenu** manages a HashMap of all the KeyInputMenuItems so each expected input is mapped accordingly to the correct menuItem. It helps to get the menuItem by accessing the map of items.
- This way when for example left is pressed, the map of items fetches us the item that holds the command for it and invokes it.
- This specific command calls the receiver that is assigned to handle the left input and (as per in Level One) shifts the greencar to the left.

3. **Strategy** by Haard Shah
![alt text](./images/StrategyDesignPattern.png?raw=True)

- Two strategies (levels) have been implemented in the game where some aspect of the game have been manipulated to make the game more interesting.
    - **Level One**: Speed of the obstacles coming down have been set to a normal rate which is much easier for user to deal with and score easily with 4 health points.
    - **Level Two**: Speed of the obstacles is increased compared to Level One which makes is more competitive. Also, the keyboard commands have been interchanged to make it more difficult along with decreasing the probability of Lifelines coming down.
- **IStrategy** acts as the interface for the strategies which they need to abide by.
- **LevelOne** and **LevelTwo** are the concrete strategies.
- **ILevelInterface** defines the generic functionalities that the levels need to perform in order to get the game going.
- **StrategyBuilder** helps in order to orchestrate the levels between different calls within the project.

4. **Decorator** by Akash Amin
![alt text](./images/DecoratorDesignPattern.png?raw=True)

- To make the game more interesting we have provided with two obstacles, one is the Red Car obstacle and the other is the Life Obstacle.
- The Decorator design pattern is implemented to provide Collision checks to various obstacles.
- The **CollisionDecorator** basically defines the structure for the decorators and extends the **Actor** class of greenfoot.
- The **RedCar** and **LifeObstacle** are two decorators that implements the functionality where it checks collision with GreenCar and provides the collision update accordingly.

5. **State** by Ronak Prajapati
![alt text](./images/StateDesignPattern.png?raw=True)

- Behaviour of the game (Player's Car/GreenCar) depends on CatStateMachine state. It makes state transitions based on the health remaining
  for the player's car for the ongoing game States can be transited to NoLifeLineState, OneLifeLineState, 
  TwoLifeLineState and ThreeLifeLineState.
- On the event of collision, CarStateMachine identifies the collided obstacle which can be either RedCar or Life.
- CarStateMachine uses ICarStateMachine interface to implement required methods to perform its tasks of handling state 
  of the user's car during the game.
- All the states mentioned earlier implements ICarState interface in order to define the necessary methods declared in 
  the interface.
- All the state transitions based on the current state of the CarStateMachine are indicated in the state transition 
  table below:
![alt text](./images/stateTransitionTable.png?raw=True)

### Class Diagram of the Project
![alt text](./images/ClassDiagram.png?raw=True)

### Game Features
- 2 levels in the game
- 4 lives given to the player initially
- 2 types of obstacles: RedCar and Life
- Colliding with RedCar Obstacle will result in the loss of one life at a time
- Colliding with Life Obstacle will gain a life (Maximum number of lives a player gets to keep is 4)
- Game will be over when player collides with RedCar having only 1 life and player's score will be displayed

## Project Backlog and Burndown Chart
1. Backlog
![alt text](./images/SprintTaskSheet.png?raw=True)

2. Burndown Chart
![alt text](./images/BurndownChart.png?raw=True)