# Number Puzzle

A Java implementation of a 3x3 sliding number puzzle (8-puzzle) with logic for validating moves, applying slides, and searching for a solution path.

## Project structure

- `/home/runner/work/number-puzzle/number-puzzle/src/NumberPuzzle.java` – main puzzle implementation
- `/home/runner/work/number-puzzle/number-puzzle/src/RunNumberPuzzleTester.java` – runs the core puzzle tests
- `/home/runner/work/number-puzzle/number-puzzle/src/RunNumberPuzzleSolverTester.java` – runs solver-focused tests
- `/home/runner/work/number-puzzle/number-puzzle/lib/TestArchive.jar` – test harness dependency

## Requirements

- Java 17 (or compatible JDK)

## Compile

From the repository root (`/home/runner/work/number-puzzle/number-puzzle`):

```bash
mkdir -p bin
javac -cp "lib/TestArchive.jar" -d bin src/*.java
```

## Run tests

Core tests:

```bash
java -cp "bin:lib/TestArchive.jar" RunNumberPuzzleTester
```

Solver tests:

```bash
java -cp "bin:lib/TestArchive.jar" RunNumberPuzzleSolverTester
```

## Puzzle conventions

- The empty tile is represented by `0`.
- Goal state is:

```text
1 2 3
4 5 6
7 8 0
```
