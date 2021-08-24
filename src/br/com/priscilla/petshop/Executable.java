package br.com.priscilla.petshop;


public class Executable {

	static Animal cachorroA = new Animal("Matheus","Cachorro","Beagle","Marrom e branco", 5);
	static Animal gatoAnimal = new Animal("Nori", "Indefinido", "Indefinido", "Cinza",2);
	public static void main(String[] args) {
		
		//Preenchimento das propriedades das instâncias de Animal
	
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
		//Utilizando os métodos da instância de Animal
		cachorroA.scheduleProc("23/08/2021", "Cortar as unhas");
		cachorroA.finishStay("25/08/2021", "saída de estadia");
		
		gatoAnimal.scheduleProc("24/08/2021", "Vacinação contra raiva");
		gatoAnimal.finishStay("25/08/2021", " aplicação da vacina");
		cachorroA.calculate(100.00, 50.00);
		
		gatoAnimal.calculate(10,50);
		
	}

}
