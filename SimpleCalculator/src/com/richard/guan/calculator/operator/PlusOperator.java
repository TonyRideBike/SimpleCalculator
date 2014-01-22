package com.richard.guan.calculator.operator;

import java.util.ArrayList;

import com.richard.guan.calculator.interfaces.Operator;
import com.richard.guan.calculator.model.CalculatorData;

public class PlusOperator implements Operator {
	private static String OperatorName = "+";

	@Override
	public String getName() {
		return OperatorName;
	}

	@Override
	public CalculatorData calculate(ArrayList<CalculatorData> data) {
		CalculatorData firstData = data.get(0);
		CalculatorData secondData = data.get(1);

		return new CalculatorData(firstData.getNum() + secondData.getNum());
	}
}
