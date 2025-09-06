 This Java program that takes a string and a number as input and shifts the string's characters by the given number.

## Requirements

- Java 8+
- The input string must contain **letters only** (no digits or symbols).
- The number can be any integer (positive or negative).

## How to Run

1. **Clone the repository:**

git clone https://github.com/your-username/ShiftCharacters.git
cd StringShifter

2. **Compile the Java file:**

javac ShiftCharacters.java

3. **Run the Program**

java ShiftCharacters

4. **Example Input:**

Enter a string (letters only): abcdef
Enter a number: 10

**Output**
Shifted String: cdefab
Shifted String: cdefab

**Notes**
1. If the number exceeds the length of the string, it wraps around using modulus.
2. If invalid input is provided, the program exits with an error message.
