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
public class Bicycle extends Vehicle{
	private int myGearCount;

	public Bicycle(String myBrand, String myModel) {
		super(myBrand, myModel);
		System.out.println(Bicycle.class.getSimpleName());
		System.out.println("Brand : " + getMyBrand());
		System.out.println("Model : " + getMyModel());
		setMyGearCount(23);
		System.out.println("Jumlah Gear : " + this.myGearCount + "\n");
	}

	public int getMyGearCount() {
		return myGearCount;
	}

	public void setMyGearCount(int myGearCount) {
		this.myGearCount = myGearCount;
	}
	
	
}
