package com.richard.guan.calculator.module;

import java.util.HashMap;

import com.richard.guan.calculator.interfaces.Operator;
import com.richard.guan.calculator.operator.MinusOperator;
import com.richard.guan.calculator.operator.PlusOperator;

public class OperatorBox {
	private static OperatorBox Instance;
	private HashMap<String, Operator> storage;

	static {
		OperatorBox.getInstance().register(new PlusOperator());
		OperatorBox.getInstance().register(new MinusOperator());
	}

	private OperatorBox() {
		storage = new HashMap<String, Operator>();
	}

	public static OperatorBox getInstance() {
		if (Instance == null) {
			Instance = new OperatorBox();
		}

		return Instance;
	}

	public void register(Operator operator) {
		this.storage.put(operator.getName(), operator);
	}

	public Operator getOperator(String name) {
		return this.storage.get(name);
	}
}
