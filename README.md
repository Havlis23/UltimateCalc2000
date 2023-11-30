# UltimateCalc2000

UltimateCalc2000 is a simple calculator application built using JavaFX. It performs basic arithmetic operations such as addition, subtraction, multiplication, and division. The calculator has a user-friendly graphical interface that allows users to input and calculate mathematical expressions.

## Features

- Addition, subtraction, multiplication, and division operations.
- Clear (C) and All Clear (AC) buttons to reset calculations.
- Decimal point support for floating-point numbers.

## How to Use

1. **Numeric Input:** Click on the numeric buttons (0-9) and the decimal point to input numbers.

2. **Operators:** Click on the addition (+), subtraction (-), multiplication (×), and division (÷) buttons to perform corresponding operations.

3. **Clearing Input:** Use the "C" button to clear the current input, and "AC" to reset all calculations.

4. **Equals (=) Button:** Click the equals button to calculate the result based on the entered expression.

## Code Structure

The application is structured using Java and JavaFX. The main logic is contained within the `HelloController` class, which handles button clicks and performs calculations. The `calculate` method is responsible for executing arithmetic operations.

```java
// Sample code snippet
public class HelloController {
    // ... (other code)

    @FXML
    protected void handleOnAnyButtonClicked(ActionEvent evt) {
        // ... (button click logic)
    }

    BigDecimal calculate(String operator, BigDecimal left, BigDecimal right) {
        // ... (arithmetic calculation logic)
    }
}
```

## Dependencies

- JavaFX: The Java library for building rich cross-platform applications.

## How to Run

1. Ensure you have Java installed on your machine.

2. Compile and run the application using your preferred Java IDE or command-line tools.

```bash
javac -cp path/to/javafx-sdk/lib/*:. HelloApplication.java
java --module-path path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml HelloApplication
```

Feel free to explore, modify, and enhance the UltimateCalc2000 calculator as needed. If you encounter any issues or have suggestions for improvement, please open an issue on GitHub.

Happy calculating! 🧮✨
