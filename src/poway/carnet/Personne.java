package poway.carnet;

import javafx.beans.property.SimpleStringProperty;

public class Personne
{
	private SimpleStringProperty nom;
	private SimpleStringProperty prenom;
	private SimpleStringProperty numero;
	private SimpleStringProperty email;

	public Personne(String nom, String prenom, String numero, String email)
	{

		this.nom = new SimpleStringProperty(nom);
		this.prenom = new SimpleStringProperty(prenom);
		this.numero = new SimpleStringProperty(numero);
		this.email = new SimpleStringProperty(email);
	}

	public Personne(String[] personne)
	{
		this(personne[0], personne[1], personne[2], personne[3]);

	}

	public SimpleStringProperty getNom()
	{
		return nom;
	}

	public void setNom(SimpleStringProperty nom)
	{
		this.nom = nom;
	}

	public SimpleStringProperty getPrenom()
	{
		return prenom;
	}

	public void setPrenom(SimpleStringProperty prenom)
	{
		this.prenom = prenom;
	}

	public SimpleStringProperty getNumero()
	{
		return numero;
	}

	public void setNumero(SimpleStringProperty numero)
	{
		this.numero = numero;
	}

	public SimpleStringProperty getEmail()
	{
		return email;
	}

	public void setEmail(SimpleStringProperty email)
	{
		this.email = email;
	}

}
