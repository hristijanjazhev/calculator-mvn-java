package mk.com.iwec.calculator.service;

import mk.com.iwec.calculator.service.interfaces.IArithmeticService;

public class CalculatorService {
	public static void main(String[] args) {
		String operation = args[0];
		double firstInput = Double.parseDouble(args[1]);
		double secondInput = Double.parseDouble(args[2]);

		IArithmeticService arithmeticOperation = new ArithmeticService();
		
		switch (operation) {
		case "add":
			System.out.println(arithmeticOperation.Add(firstInput, secondInput));
			break;
		case "subtract":
			System.out.println(arithmeticOperation.Substract(firstInput, secondInput));
			break;
		case "multiply":
			System.out.println(arithmeticOperation.Multiply(firstInput, secondInput));
			break;
		case "divide":
			System.out.println(arithmeticOperation.Divide(firstInput, secondInput));
			break;
		default:
			System.out.println("Invalid operation: " + operation);
		}
	}
}
