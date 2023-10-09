package Day03;

//Creating Parent class
class Bank {
	int getRateofInterest() {
		return 0;
	}
}

//Creating child class SBI
class SBI extends Bank {
	int getRateofInterest() {
		return 8;
	}
}

//Creating child class ICICI
class ICICI extends Bank {
	int getRateofInterest() {
		return 7;
	}
}

//Creating child class AXIS
class AXIS extends Bank {
	int getRateofInterest() {
		return 9;
	}
}

public class Test2 {
	public static void main(String[] args) {
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();

		System.out.println("SBI rate of Interest= " + s.getRateofInterest());
		System.out.println("ICICI rate of Interest= " + i.getRateofInterest());
		System.out.println("AXIS rate of Interest= " + a.getRateofInterest());

	}

}
