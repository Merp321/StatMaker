
package carPayments;

public class carPayments {

	private double Interest;
	private double DownPayment;
	private double CarCost;
	private int Loan;
	public carPayments(double i, double d, double c, int l) {
		this.Interest = i;
		this.DownPayment = d;
		this.CarCost = c;
		this.Loan = l;
}
	public double monthlyPayment() {
		double remainder = CarCost - DownPayment;
		return ((Interest/12) * remainder)/(1-Math.pow((1 + Interest/12), (-1) * Loan));
}
	public double InterestPaid() {
		return ((monthlyPayment() * Loan) - (CarCost - DownPayment));

}
}