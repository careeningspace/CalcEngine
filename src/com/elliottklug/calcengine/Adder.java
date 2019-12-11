package com.elliottklug.calcengine;

public class Adder extends CalculateBase implements MathProcessing{
	public Adder() {}
	public Adder(double leftVal, double rightVal) {
		super(leftVal, rightVal);
	}
	
	@Override
	public void calculate() {
		double value = getLeftVal() + getRightVal();
		setResult(value);
	}

}
