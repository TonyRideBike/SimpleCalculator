package com.richard.guan.calculator.interfaces;

import java.util.ArrayList;

import com.richard.guan.calculator.model.CalculatorData;

public interface Operator {

	public String getName();
	public CalculatorData calculate(ArrayList<CalculatorData> dataList);
}
