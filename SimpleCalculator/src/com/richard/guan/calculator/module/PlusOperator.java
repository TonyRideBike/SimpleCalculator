package com.richard.guan.calculator.module;

import com.richard.guan.calculator.model.CalculatorData;

public class PlusOperator implements Operator {
	private static String OperatorName = "+";

	@Override
	public String getName() {
		return OperatorName;
	}

	@Override
	public CalculatorData calculate(CalculatorData... data) {
		CalculatorData firstData = data[0];
		CalculatorData secondData = data[1];

		return new CalculatorData(firstData.getNum() + secondData.getNum());
	}
}
