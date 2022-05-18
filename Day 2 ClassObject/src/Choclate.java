
public class Choclate {
	
	private String company;
	private double price;
	private double weight;
	private String packing;
	public Choclate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Choclate(String company, double price, double weight, String packing) {
		super();
		this.company = company;
		this.price = price;
		this.weight = weight;
		this.packing = packing;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getPacking() {
		return packing;
	}
	public void setPacking(String packing) {
		this.packing = packing;
	}
	@Override
	public String toString() {
		return "Choclate [company=" + company + ", price=" + price + ", weight=" + weight + ", packing=" + packing
				+ "]";
	
	}
	
}
