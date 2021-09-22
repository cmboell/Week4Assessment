/**
 *@author -Colby Boell -cmboell
 *CIS175 -Fall 2021
 *Sep 21, 2021
 */
package model;

           //child class
public class Multiply extends Math{
	private double result;
	//constructor
	public Multiply(double firstNumber, double secondNumber) {
		super(firstNumber, secondNumber);
		this.result = multiplyNumbers(firstNumber, secondNumber);
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
	private double multiplyNumbers(double firstNumber, double secondNumber) {
		double multiply = firstNumber * secondNumber;
		return multiply;
	}

	
}
