
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer = new Customer();
		customer.setCustomerID(10010);
		customer.setCustomerName("이순신");
		customer.bonusPoint = 1000;
		System.out.println(customer.showCustomerInfo());
		
		
		ViIPcustomer vip = new ViIPcustomer();
		
		vip.setCustomerID(10020);
		vip.setCustomerName("김유신");
		vip.bonusPoint = 10000;
		System.out.println(vip.showCustomerInfo());
		
		
		customer = new ViIPcustomer();
		customer.calcPrice(10000);
		
		if(customer instanceof Customer) {
			System.out.println("customer");
		}else {
			System.out.println("no");
		}
	}

}
