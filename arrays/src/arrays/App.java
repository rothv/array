package arrays;

public class App {

	public static void main(String[] args) {

		Cat cat1 = new Cat();
		cat1.name = "Nelix";
		cat1.age = 2;
		cat1.breed ="Kurzhaar";
		cat1.color= "orange";
		
		Cat cat2 = new Cat();	
		cat2.name= "Michelle";
		cat2.age= 3;
		cat2.breed="Siam";
		cat2.color="black";
		
		
		Cat[] cats = {cat1, cat2};
		
		for (int i = 0; i < cats.length; i++){
			
			System.out.println(cats[i].name);
			
		}
	}

}
