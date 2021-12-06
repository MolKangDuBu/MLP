
public class ViIPcustomer extends Customer{
	
	int agentID;
	double saleRatio;
	
	public ViIPcustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public int calcPrice(int price) {
		System.out.println("VIP==========");
		bonusPoint += price*bonusRatio;
		return price -(int)(price*saleRatio);
	}
	
	public int getAgentID(){
		return agentID;
	}
}
