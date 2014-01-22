package com.richard.guan.calculator.module;

import com.richard.guan.calculator.model.CalculatorData;

public interface Operator {

	public String getName();
	public CalculatorData calculate(CalculatorData... data);
}
