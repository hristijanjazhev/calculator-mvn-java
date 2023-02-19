## Calculator Project

This project is based on simple arithmetic operations for testing purposes.
In this project, I will demonstrate how I work with arguments passed by a user in the 'CommandLine' while executing the jar file, with the help of the maven. For the right use of this project, i will show you the commands for executing from the 'CommandLine'.

## Installation

*For this project I'm using Apache Maven '3.9.0 version' and Java: '17'  version.
When we finally locate the project folder in the 'CommandLine', feel free to start using these commands :

```bash
mvn compile
```
*Running tests:
```bash
mvn test
```
*Creating jar:
```bash
mvn package 
```
*Run the jar we have created before:
```bash
java -cp target/"test-SNAPSHOT-0.0.1.jar" "mk.com.test.main.App" 
```
## Usage

```python
#For using the arithmetic operations within the command line, you need to follow these steps:

# To use Addion:
java -cp target/"test-SNAPSHOT-0.0.1.jar" "mk.com.test.main.App" add 10 5

# To use Subtract:
java -cp target/"test-SNAPSHOT-0.0.1.jar" "mk.com.test.main.App" subtract 33 2

# To use Divide:
java -cp target/"test-SNAPSHOT-0.0.1.jar" "mk.com.test.main.App" divide 33 2

# To use Multiplication:
java -cp target/"test-SNAPSHOT-0.0.1.jar" "mk.com.test.main.App" multiply 33 2
```

## Contributing

Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

