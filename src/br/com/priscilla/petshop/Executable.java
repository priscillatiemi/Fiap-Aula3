package br.com.priscilla.petshop;


public class Executable {

	static Animal cachorroA = new Animal("Matheus","Cachorro","Beagle","Marrom e branco", 5);
	static Animal gatoAnimal = new Animal("Nori", "Indefinido", "Indefinido", "Cinza",2);
	public static void main(String[] args) {
		
		//Preenchimento das propriedades das inst�ncias de Animal
	
//		cachorroA.name = "Nori";
//		cachorroA.specie = "Cachorro";
//		cachorroA.race = "Beagle";
//		cachorroA.color = "Marrom e branco";
//		cachorroA.age = 5;
//		
//		gatoAnimal.name = "Cookie";
//		gatoAnimal.specie = "Indefinido";
//		gatoAnimal.race = "Indefinido";
//		gatoAnimal.color = "Cinza";
//		gatoAnimal.age = 6;
		//Utilizando os m�todos da inst�ncia de Animal
		cachorroA.scheduleProc("23/08/2021", "Cortar as unhas");
		cachorroA.finishStay("25/08/2021", "sa�da de estadia");
		
		gatoAnimal.scheduleProc("24/08/2021", "Vacina��o contra raiva");
		gatoAnimal.finishStay("25/08/2021", " aplica��o da vacina");
		cachorroA.calculate(100.00, 50.00);
		
		gatoAnimal.calculate(10,50);
		
	}

}
