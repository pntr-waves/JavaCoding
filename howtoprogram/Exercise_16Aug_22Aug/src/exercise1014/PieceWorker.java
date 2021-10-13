package exercise1014;

public class PieceWorker extends Employees {
	private double wage;
	private double numberOfPieces;

	public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage,
			double numberOfPieces) {
		super(firstName, lastName, socialSecurityNumber);
		if (wage <= 0) {
			throw new IllegalArgumentException("wage must be > 0");
		}
		if (numberOfPieces < 0) {
			throw new IllegalArgumentException("number of pieces must be >= 0 ");
		}
		this.wage = wage;
		this.numberOfPieces = numberOfPieces;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if (wage <= 0) {
			throw new IllegalArgumentException("wage must be > 0");
		}
		this.wage = wage;
	}

	public double getNumberOfPieces() {
		return numberOfPieces;
	}

	public void setNumberOfPieces(double numberOfPieces) {
		if (numberOfPieces < 0) {
			throw new IllegalArgumentException("number of pieces must be >= 0 ");
		}
		this.numberOfPieces = numberOfPieces;
	}

	@Override
	public String toString() {
		return super.toString() + "has wage: " + getWage();
	}

	@Override
	public double earning() {
		return this.wage * this.numberOfPieces;
	}

}
