package com.tobias.Q6;

class AC {
	public void On(String mode) {
		
		if (mode.equals("Strong"))
		System.out.println("AC status: " + mode);
		else {
			mode = "Weak";
			System.out.println("AC status: " + mode);
		}
	}

	public void Off(String mode) {
		mode = "Off";
		System.out.println("AC status: " + mode);
	}
}

public class FAN {

	public void On(String mode) {
		if (mode.equals("Strong"))
			System.out.println("Fan status: " + mode);
		else {
			mode = "Weak";
			System.out.println("AC status: " + mode);
		}
	}

	public void Off(String mode) {
		mode = "Off";
		System.out.println("Fan status: " + mode);
	}

	public static void main(String[] args) {
		FAN fan = new FAN();
		AC ac = new AC();
		ac.On("Weak");
		ac.Off("off");

	}

}
