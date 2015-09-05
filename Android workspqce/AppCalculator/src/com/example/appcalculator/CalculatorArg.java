package com.example.appcalculator;

public class CalculatorArg {
	public enum Option {
		X, DIV, ADD, SUB

	}
	private float value;
	private Option option;
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	public Option getOption() {
		return option;
	}
	public void setOption(Option option) {
		this.option = option;
	}
	public CalculatorArg(float value, Option option) {
		this.value = value;
		this.option = option;
	}
	
}
