package overriding;

public class Main {

	public static void main(String[] args) {
		//OgretmenKrediManager ogretmenKrediManager =new OgretmenKrediManager();
		//ogretmenKrediManager.hesapla(1000);
		BaseKrediManager[] krediManagers=new BaseKrediManager[]
				{new OgretmenKrediManager(),new TarımKrediManager(),new OgrenciKrediManager()};
		
		for(BaseKrediManager krediManager:krediManagers) {//BaseKrediManager türündeki kredimanager kredimanagers da
			
			System.out.println(krediManager.hesapla(1000));
			//newlediğimiz 2 kredimanager i hesaplayıp ayrı ayrı yazdırıyor.1000*1.18 
		}

	

}
}
