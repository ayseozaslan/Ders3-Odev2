package abstractClases;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator=new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		GameCalculator  gameCalculator=new WomanGameCalculator();
		
	}

}//Abstract sınıflar ezilmediği takdirde newlenemez.
//Zorunlu içi doldurulması gereken operasyonlar eklenmek zorunda
//Claslardan farkı newlenmemesi.
