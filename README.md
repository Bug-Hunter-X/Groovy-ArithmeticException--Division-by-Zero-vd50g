# Groovy ArithmeticException: Division by Zero

This repository demonstrates a common Groovy error: an `ArithmeticException` caused by division by zero. The `bug.groovy` file contains code that triggers this exception. The `bugSolution.groovy` file provides a solution to handle this error gracefully.

## Bug Description

The bug occurs in `method3()` of the `MyClass` class. An attempt to divide 10 by 0 causes an `ArithmeticException` and terminates the program execution.  This demonstrates the necessity of proper error handling when dealing with potential division by zero scenarios.

## Solution

The solution involves using a `try-catch` block to handle the potential `ArithmeticException`.  This allows the program to continue executing even when a division by zero occurs, preventing unexpected program termination.  It also allows for appropriate logging or alternative actions to mitigate the error.
