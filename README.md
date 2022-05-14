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


### Class Diagrams for each Design Pattern Implemented

1. **Singleton** by Shivang Patel

2. **Command** by Shivang Patel

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

5. **State** by Ronak Prajapati

## Project Backlog and Burndown Chart
1. Backlog
![alt text](./images/SprintTaskSheet.png?raw=True)

2. Burndown Chart
![alt text](./images/BurndownChart.png?raw=True)