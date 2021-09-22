/**
 *@author -Colby Boell -cmboell
 *CIS175 -Fall 2021
 *Sep 21, 2021
 */
package model;

/**
 * @author cmboe
 *
 */
public class Math { //parent class
	//variables
	protected double firstNumber;
	protected double secondNumber;
	//constructors
	public Math() {
		super();
	}
	public Math(double firstNumber, double secondNumber) {
		setFirstNumber(firstNumber);
		setSecondNumber(secondNumber);
	}
	//getters and setters
	/**
	 * @return the firstNumber
	 */
	public double getFirstNumber() {
		return firstNumber;
	}
	/**
	 * @param firstNumber the firstNumber to set
	 */
	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}
	/**
	 * @return the secondNumber
	 */
	public double getSecondNumber() {
		return secondNumber;
	}
	/**
	 * @param secondNumber the secondNumber to set
	 */
	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	} 
	
}
