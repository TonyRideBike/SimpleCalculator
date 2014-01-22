package com.richard.guan.calculator;

import com.richard.guan.calculator.interfaces.Operator;
import com.richard.guan.calculator.model.CalculatorData;
import com.richard.guan.calculator.module.OperatorBox;

public class CalculatorTester {

	public static void main(String args[]) {
		calculate();
	}

	private static void calculate() {
		try {
			Operator operator = OperatorBox.getInstance().getOperator("-");
			CalculatorData result = operator.calculate(new CalculatorData(6),
					new CalculatorData(2));
			System.out.print(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
