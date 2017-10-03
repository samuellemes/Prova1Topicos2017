package br.edu.univas.si8.ta.fibcalc.api;

public class Result {
	private int number;
	private int fibonacci;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int num) {
		this.number = num;
	}
	
	public Result withNum (int num) {
		this.number = num;
		return this;
	}
	public int getFibonacci() {
		return fibonacci;
	}
	public void setFibonacci(int result) {
		this.fibonacci = result;
	}
	
	public Result withResult (int result){
		this.fibonacci = result;
		return this;
	}
	

}
