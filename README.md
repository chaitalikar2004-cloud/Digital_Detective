# Digital Detective
Digital Detective is an interactive detective game developed using Java and JavaFX. The player investigates a mystery by examining suspects, evidence, and statements to identify the person responsible for the crime.

## About the Project

In this game, a valuable diamond has disappeared. The player acts as a detective and investigates the case by reviewing different suspects, clues, evidence, and statements.

After analyzing all the information, the player selects the suspect they believe is responsible and attempts to solve the case.

## Features

- Interactive detective investigation
- View multiple suspects
- Examine evidence and clues
- Read suspect statements
- Choose a suspect to solve the case
- Displays whether the selected answer is correct
- User-friendly JavaFX graphical interface

## Technologies Used

- Java
- JavaFX
- Object-Oriented Programming (OOP)
- Visual Studio Code

## Project Structure

```text
Digital-Detective
│
├── src
│   ├── Case.java
│   ├── Evidence.java
│   ├── Main.java
│   ├── Statement.java
│   ├── Suspect.java
│   └── Test.java
│
└── README.md
```

## How to Run the Project

### Prerequisites

Make sure you have installed:

- Java JDK
- JavaFX SDK

### Step 1: Open the src folder

Open the terminal inside the `src` folder.

### Step 2: Compile the project

```powershell
javac --module-path "C:\javafx\javafx-sdk-26.0.2\lib" --add-modules javafx.controls Case.java Evidence.java Suspect.java Statement.java Test.java Main.java
```

### Step 3: Run the application

```powershell
java --module-path "C:\javafx\javafx-sdk-26.0.2\lib" --add-modules javafx.controls Main
```

## How to Play

1. Start the Digital Detective application.
2. Click START CASE.
3. Investigate the suspects.
4. Examine the available evidence.
5. Read the statements given by the suspects.
6. Analyze all the clues carefully.
7. Select the suspect you believe committed the crime.
8. Submit your answer and solve the case.

## Concepts Used

This project demonstrates several important programming concepts:

- Classes and Objects
- Encapsulation
- ArrayList
- Constructors
- Getter Methods
- Object-Oriented Programming
- JavaFX GUI Development
- Event Handling

## Conclusion

Digital Detective demonstrates how Java and Object-Oriented Programming can be combined with JavaFX to create an interactive application.

The project provides a simple and engaging way to understand how classes, objects, collections, and graphical user interfaces work together in a real-world-style application.
