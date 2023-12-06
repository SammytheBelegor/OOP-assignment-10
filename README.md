StringProcessor Project
Overview
This project includes a StringProcessor class with various string processing methods and a corresponding test suite implemented using JUnit. The methods in StringProcessor cover password strength checking, digit counting, word counting, and expression evaluation.

Issues Faced
During the development of this project, I encountered issues related to library imports and running Java code. The primary challenge was including the JUnit library in the project to facilitate unit testing. Below are the steps to overcome these challenges.

Setup Instructions
1. Java Environment
Ensure that you have Java installed on your system. You can download and install it from Java SE Downloads.

2. JUnit Library
Download the JUnit JAR files from JUnit Downloads.

Create a lib folder in your project root and place the downloaded JAR files into it.

3. Compilation and Execution
Compile the Java files from the project root using the following commands (replace semicolon with a colon on Unix/Linux systems):

bash
Copy code
javac -cp .;lib/* StringProcessorTest.java StringProcessor.java
Run the tests using:

bash
Copy code
java -cp .;lib/* org.junit.runner.JUnitCore StringProcessorTest
Ensure that you are in the project root directory when running these commands.

Test Results
Upon successfully running the tests, you should see output indicating whether each test case passed or failed. Adjust the code and repeat the steps as needed to resolve any failures.
