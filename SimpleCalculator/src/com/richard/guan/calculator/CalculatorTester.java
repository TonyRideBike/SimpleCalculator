package com.richard.guan.calculator;

import java.util.ArrayList;

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
			ArrayList<CalculatorData> dataList = new ArrayList<CalculatorData>();
			dataList.add(new CalculatorData(6));
			dataList.add(new CalculatorData(2));
			
			CalculatorData result = operator.calculate(dataList);
			System.out.print(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
