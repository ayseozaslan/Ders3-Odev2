package Interfaces;

public class CustomerManager {
	
	ICustomerDal customerDal;
	
	public void add() {
		//İş Kodları
		customerDal.Add();
	}

}
