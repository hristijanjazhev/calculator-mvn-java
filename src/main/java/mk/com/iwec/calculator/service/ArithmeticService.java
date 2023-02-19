package mk.com.iwec.calculator.service;

import mk.com.iwec.calculator.service.interfaces.IArithmeticService;

public class ArithmeticService implements IArithmeticService {

	public double Add(double a, double b) {
		return a + b;
	}

	public double Substract(double a, double b) {
		return a - b;
	}

	public double Multiply(double a, double b) {
		return a * b;
	}

	public double Divide(double a, double b) {
		return a / b;
	}
}
