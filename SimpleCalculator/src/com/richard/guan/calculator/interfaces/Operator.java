package com.richard.guan.calculator.interfaces;

import com.richard.guan.calculator.model.CalculatorData;

public interface Operator {

	public String getName();
	public CalculatorData calculate(CalculatorData... data);
}
