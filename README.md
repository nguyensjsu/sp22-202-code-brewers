# Team Project (Code Brewers)

## Topic

This project is about a game developed in Greenfoot named **DodgeCar** in which the user plays as a GreenCar avoiding obstacles such as RedCars and collecting lifelines on the way in order to score the highest.

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


### Class Diagrams for each Design Pattern Implemented

1. **Singleton** by Shivang Patel

2. **Command** by Shivang Patel

3. **Strategy** by Haard Shah
![alt text](./images/StrategyDesignPattern.png?raw=True)

- 

4. **Decorator** by Akash Amin
![alt text](./images/DecoratorDesignPattern.png?raw=True)
- To make the game more interesting we have provided with two obstacles, one is the Red Car obstacle and the other is the Life Obstacle
- The Decorator design pattern is implemented to provide Collision checks to various obstacles.
- The CollisionDecorator basically defines the structure for the decorators and extends the actor class of greenfoot.
- The RedCar and LifeObstacle are two decorators that implements the functionality where it checks collision with GreenCar and provides the collision update accordingly. 


5. **State** by Ronak Prajapati

## Project Backlog and Burndown Chart
1. Backlog
![alt text](./images/SprintTaskSheet.png?raw=True)

2. Burndown Chart
![alt text](./images/BurndownChart.png?raw=True)
