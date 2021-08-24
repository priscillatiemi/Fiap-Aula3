package br.com.priscilla.petshop;

public class Animal {
	
	//Propriedades
	private String name;
	private String specie;
	private String race;
	private String color;
	private int age;
	
	//Métodos construtores ou inicializadores
//	public Animal(){
//		System.out.println("Um animal foi criado!");
//	}
//	
	public Animal(String aName, String aSpecie, String aRace, String aColor, int aAge) {
		this.name = aName;
		this.specie = aSpecie;
		this.race = aRace;
		this.color = aColor;
		this.age = aAge;
	}
	
	//Métodos
	public void scheduleProc(String date, String obs) {
		System.out.println(String.format("Pet %s agendou procedimento em %s com a Observação %s", name, date,obs));
	}
	
	public void finishStay(String date, String obs) {
		System.out.println(String.format("Pet %s deixou a loja em %s com observação %s",name, date,obs));

	}
	
	//Métodos com sobrecarga
	public void calculate(int valorA, int valorB){
		int result = valorA + valorB;
		
		System.out.println(String.format("Resultado da conta: R$%s", result));
	}
	
	//criamos a sobrecarga do método, duas funções distintas
	//para o método calculate
	void calculate(Double valorA, Double valorB){
		Double result = valorA + valorB;
		
		System.out.println(String.format("Resultado da conta: R$%s", result));
	}
	
}
