package arrays2;

public class App {
	
	//projekt heute

	public static void main(String[] args) {

		StrUtils su = new StrUtils();
		
		Plant plant1 = new Plant();
		
		plant1.botanicalName="Artemisia absinthium";
		plant1.germanName="Wermut";

	Plant plant2 = new Plant();
		
		plant2.botanicalName="Capsicum annuum";
		plant2.germanName="Paprika, Süßer";

	Plant plant3 = new Plant();
		
		plant3.botanicalName="Castanea sativa";
		plant3.germanName="Eßkastanie";

	Plant plant4 = new Plant();
		
		plant4.botanicalName="Citrus limon";
		plant4.germanName="Zitrone";

	Plant plant5 = new Plant();
		
		plant5.botanicalName="Corylus avellana";
		plant5.germanName="Haselnuß";
		
		
		Plant[] plants = {plant1, plant2, plant3, plant4, plant5};
		
		
		
for (int i = 0; i < plants.length; i++){
			
			String s = plants[i].botanicalName;
			
			int count = su.countChars(s);
			
			System.out.println(count);
			
			

	}

}
}

