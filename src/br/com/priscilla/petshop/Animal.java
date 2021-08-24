package br.com.priscilla.petshop;

public class Animal {
	
	//Propriedades
	private String name;
	private String specie;
	private String race;
	private String color;
	private int age;
	
	//M�todos construtores ou inicializadores
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
	
	//M�todos
	public void scheduleProc(String date, String obs) {
		System.out.println(String.format("Pet %s agendou procedimento em %s com a Observa��o %s", name, date,obs));
	}
	
	public void finishStay(String date, String obs) {
		System.out.println(String.format("Pet %s deixou a loja em %s com observa��o %s",name, date,obs));

	}
	
	//M�todos com sobrecarga
	public void calculate(int valorA, int valorB){
		int result = valorA + valorB;
		
		System.out.println(String.format("Resultado da conta: R$%s", result));
	}
	
	//criamos a sobrecarga do m�todo, duas fun��es distintas
	//para o m�todo calculate
	void calculate(Double valorA, Double valorB){
		Double result = valorA + valorB;
		
		System.out.println(String.format("Resultado da conta: R$%s", result));
	}
	
}
