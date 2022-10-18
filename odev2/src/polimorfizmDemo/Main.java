package polimorfizmDemo;

public class Main {

	public static void main(String[] args) {
		//EmailLogger logger=new EmailLogger();
		//logger.log("Log mesajı");
		
		//BaseLogger[] loggers =new BaseLogger[] { new FileLogger(),new EmailLogger(),new DataBaseLogger(),new ConsoleLogger()};
        //tüm new loggerları baselogger ile extends ettiğimiz için hata vermez.
		
		//POLİMORFİZM:Classları baselogger a extends ettikten sonra tümünü bir arrrayda kullanıp  çağırmak.Çıkarme veya ekleme yapılabilir		
		
		//for(BaseLogger logger:loggers) {
			//logger.log("Log mesajı");
		//}
		
		CustomerManager customerManager=new CustomerManager(new DataBaseLogger());//database değilde farklı bir logger a loglanmak istendiğinde loglanacak loggu newlemek yeterli.
		customerManager.add();
	}

}
