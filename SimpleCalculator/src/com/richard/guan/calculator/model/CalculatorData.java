package com.richard.guan.calculator.model;

public class CalculatorData {
	private int mNum;

	public CalculatorData() {
		super();
	}

	public CalculatorData(int i) {
		this.mNum = i;
	}

	public int getNum() {
		return this.mNum;
	}

	public void setNum(int num) {
		this.mNum = num;
	}

	@Override
	public String toString() {
		return "" + mNum;
	}

}
