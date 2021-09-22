/**
 *@author -Colby Boell -cmboell
 *CIS175 -Fall 2021
 *Sep 21, 2021
 */
package model;

public class Divide extends Math{
	private double result;
	//constructor
	public Divide(double firstNumber, double secondNumber) {
		super(firstNumber, secondNumber);
		this.result = divideNumbers(firstNumber, secondNumber);
	}
	//getters and setters
	/**
	 * @return the result
	 */
	public double getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(double result) {
		this.result = result;
	}
	//method
	private double divideNumbers(double firstNumber, double secondNumber) {
		double divide = firstNumber / secondNumber;
		return divide;
	}


}