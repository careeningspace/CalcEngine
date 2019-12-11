package com.elliottklug.calcengine;

public class MathEquation {
	private double leftVal;
	private double rightVal;
	private double result;
	private char opCode = 'a';
	
	public double getLeftVal() {return leftVal;}
	public void setLeftVal(double leftVal) {this.leftVal = leftVal;}
	public double getRightVal() {return rightVal;}
	public void setRightVal(double rightVal) {this.rightVal = rightVal;}
	public double getResult() {return result;}
	public void setResult(double result) {this.result = result;}
	public char getOpCode() {return opCode;}
	public void setOpCode(char opCode) {this.opCode = opCode;}
	
	public MathEquation() {}
	
	public MathEquation(char opCode) {this.opCode = opCode;}
	
	public MathEquation(char opCode, double leftVal, double rightVal) {
		this.opCode = opCode;
		this.leftVal = leftVal;
		this.rightVal = rightVal;
	}
	

	public void execute() {
		// TODO Auto-generated method stub
		switch(opCode) {
		case 'a':
			result = leftVal + rightVal;
			break;
		case 's':
			result = leftVal - rightVal;
			break;
		case 'd':
			result = leftVal / rightVal;
			break;
		case 'm':
			result = leftVal * rightVal;
			break;
		default:
			System.out.println("Error - invalid opCode");
			result = 0.0d;
			break;
		}

	}

}
