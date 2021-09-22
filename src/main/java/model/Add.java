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
public class Add extends Math{
	//constructor

	private double result;
	public Add() {
		super();
	}	
	public Add(double firstNumber, double secondNumber) {
		super(firstNumber,secondNumber);
		this.result = addNumbers(firstNumber,secondNumber);
	}
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
	private double addNumbers(double firstNumber, double secondNumber) {
        double add = firstNumber + secondNumber;
	  return add;
	}
}
