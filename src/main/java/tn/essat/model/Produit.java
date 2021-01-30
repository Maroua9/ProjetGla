package tn.essat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Produit {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;
	private String nom;
	private int quantite;
	private float prix;
	@ManyToOne
	@JoinColumn(name = "cat_id")
	private Categorie cat;
	
	public Produit() {
		super();
	}

	public Produit(Integer id, String nom, int quantite, float prix, Categorie cat) {
		super();
		this.id = id;
		this.nom = nom;
		this.quantite = quantite;
		this.prix = prix;
		this.cat = cat;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Categorie getCat() {
		return cat;
	}

	public void setCat(Categorie cat) {
		this.cat = cat;
	}
	
	
	
}
