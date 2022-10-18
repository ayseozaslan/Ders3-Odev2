package polimorfizmDemo;

public class CustomerManager {//Database yerine farklı bir logger a loglama devam edilecegi zaman
	private BaseLogger logger;

	public CustomerManager(BaseLogger logger) {//newlerken çalışacak kod blogu .Her newlendiğinde baselogger verecek
		this.logger = logger;//çalışılacak olan logger

	}

	public void add() {//DataBaselogger e veri ekleme
		System.out.println("Müşteri Eklendi");
		//DataBaseLogger logger = new DataBaseLogger();
		//logger.Log("Log mesajı");
		this.logger.log("Log mesajı");//çağırılacak mesaj

	}
}


