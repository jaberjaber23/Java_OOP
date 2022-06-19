package pharmacyProject;

public class CustomerRate extends Customer{
	private static int sumRate = 0;
	private static int numberOfRate = 0;
	private static int rateResult = 0;

	CustomerRate() {
	}

	CustomerRate(int rateResult) {
		CustomerRate.rateResult = rateResult;
	}

	public int getSumRate() {
		return sumRate;
	}

	public void setSumRate(int sumRate) {
		CustomerRate.sumRate = sumRate;
	}

	public int getNumberOfRate() {
		return numberOfRate;
	}

	public void setNumberOfRate(int numberOfRate) {
		CustomerRate.numberOfRate = numberOfRate;
	}
	
	public int getRateResult() {
		return rateResult;
	}
	
	public void setRateResult(int rateResult) {
		CustomerRate.rateResult = rateResult;
	}

	public static void allRating(int rated) {
		userRate(rated);
		numberOfRate++;
		sumRate = sumRate + rated;
		rateResult =  sumRate/numberOfRate;
	}


}
