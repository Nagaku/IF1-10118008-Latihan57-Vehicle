/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan57.vehicle;

/**
 *
 * @author ASUS
 */
public class Skateboard extends Vehicle {
	private double myBoardLength;

	public Skateboard(String myBrand, String myModel) {
		super(myBrand, myModel);
		System.out.println(Skateboard.class.getSimpleName());
		System.out.println("Brand : " + getMyBrand());
		System.out.println("Model : " + getMyModel());
		setMyBoardLength(54.5);
		System.out.println("Panjang Board : " + this.myBoardLength);
		
	}

	public double getMyBoardLength() {
		return myBoardLength;
	}

	public void setMyBoardLength(double myBoardLength) {
		this.myBoardLength = myBoardLength;
	}
	
}
