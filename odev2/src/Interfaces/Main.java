package Interfaces;

public class Main {
	
	ICustomerDal customerDal=new OracleCustomerDal();
	CustomerManager customerManager=new CustomerManager();
	//customerManager.customerDal =new MySqlCustomerDal();
	//customerManager.add();

}
