# Music-Practice-Assitant-
Java-based practice assitant for pianists
## Project Overview
Music Practice Assistant is a Java-based senior project designed to help pianists organize their practice sessions using scheduling algorithms.
The system selects practice exercises based on their assigned value, duration, and the total time available for practice.
## Project Objectives
- Help pianists organize practice sessions efficiently.
- Select exercises within a limited practice time.
- Prioritize exercises based on their importance relative to duration.
- Implement and evaluate different scheduling approaches.
## Implemented Algorithm: Greedy Scheduling
The Greedy Scheduling algorithm uses a Priority Queue to select practice exercises based on their value per minute.
Each exercise has:
- Name
- Duration (minutes)
- Value (assigned importance)
Priority is calculated using:
Priority = Value / Duration
The algorithm processes exercises in descending priority order and selects each exercise if it fits within the remaining practice time.
## Example
Available practice time: 50 minutes
| Exercise | Duration | Value |
|----------|----------|-------|
| Scales | 10 | 8 |
| Sight-reading | 20 | 14 |
| Difficult passage | 30 | 20 |
Output:
- Scales: 10 minutes
- Sight-reading: 20 minutes
- Total tasks selected: 2
- Total time used: 30 minutes
- Total value: 22
- Remaining time: 20 minutes
## Input Validation
The system validates:
- Exercise names cannot be empty.
- Duration must be greater than zero.
- Value cannot be negative.
- Available practice time must be greater than zero.
## Testing
The Greedy Scheduling algorithm has been tested with:
- Normal scheduling scenarios.
- Situations where all exercises fit.
- Situations where no exercises fit.
- Empty task lists.
- Invalid inputs.
- Repeated schedule generation.
## Limitations
Greedy Scheduling does not always produce the optimal schedule because it prioritizes exercises based on value per minute rather than evaluating every possible combination.
A Dynamic Programming algorithm is planned as a second scheduling approach.
## Technologies
- Java
- Java Standard Library
- PriorityQueue
- Comparator
## How to Run
1. Open the project in Visual Studio Code or another Java IDE.
2. Open the `src` folder.
3. Compile the Java files.
4. Run `Main.java`.
5. View the generated practice schedule in the terminal.
## Current Development Status
- Greedy Scheduling: Implemented and tested.
- Dynamic Programming: Planned.
- Additional functionality: To be developed.
