package models.input;

public class PaySlipDTO {
	private int id;
	private String name;
	private String designation;
	private double basicPay;
	private double hra;
	private double specialAllowances;
	private double variablePay;
	private int earnedLeaves;
	private double gratuity;
	private double healthInsurance;
	private double pf;
	private int extraLeaves;
	private double grossPay;
	private double deductions;
	private double netPay;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getSpecialAllowances() {
		return specialAllowances;
	}

	public void setSpecialAllowances(double specialAllowances) {
		this.specialAllowances = specialAllowances;
	}

	public double getVariablePay() {
		return variablePay;
	}

	public void setVariablePay(double variablePay) {
		this.variablePay = variablePay;
	}

	public int getEarnedLeaves() {
		return earnedLeaves;
	}

	public void setEarnedLeaves(int earnedLeaves) {
		this.earnedLeaves = earnedLeaves;
	}

	public double getGratuity() {
		return gratuity;
	}

	public void setGratuity(double gratuity) {
		this.gratuity = gratuity;
	}

	public double getHealthInsurance() {
		return healthInsurance;
	}

	public void setHealthInsurance(double healthInsurance) {
		this.healthInsurance = healthInsurance;
	}

	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public int getExtraLeaves() {
		return extraLeaves;
	}

	public void setExtraLeaves(int extraLeaves) {
		this.extraLeaves = extraLeaves;
	}

	public double getGrossPay() {
		return grossPay;
	}

	public void setGrossPay(double grossPay) {
		this.grossPay = grossPay;
	}

	public double getDeductions() {
		return deductions;
	}

	public void setDeductions(double deductions) {
		this.deductions = deductions;
	}

	public double getNetPay() {
		return netPay;
	}

	public void setNetPay(double netPay) {
		this.netPay = netPay;
	}

}
