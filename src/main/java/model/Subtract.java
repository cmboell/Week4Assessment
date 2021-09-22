/**
 *@author -Colby Boell -cmboell
 *CIS175 -Fall 2021
 *Sep 21, 2021
 */
package model;

/**
 * @author cmboe
 *
 */                  //child class
public class Subtract extends Math {
	//constructor
	private double result;
	public Subtract(double firstNumber, double secondNumber) {
		super(firstNumber,secondNumber);
		this.result = subtractNumbers(firstNumber, secondNumber);
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
	private double subtractNumbers(double firstNumber, double secondNumber) {
		double subtract = firstNumber - secondNumber;
		return subtract;
	}
}
