package com.ali;

public class Personne {
	
	private String nom;
	private String prenom;
	private int age;
	
	
	public Personne() {
		this.age=18;
		this.nom = "dupont" ;
		this.prenom = "ali";
	}
	
	public Personne(String nom , String prenom, int age) {
		this.age = age;
		this.nom = nom ;
		this.prenom = prenom ;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	
	
}
