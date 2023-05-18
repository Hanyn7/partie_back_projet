package com.hanin.parfums.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Parfum {

	public Parfum() {
		super();
		}
	public Parfum( String nomParfum, Double prixParfum, Date date) {
		super();
		this.nomParfum = nomParfum;
		this.prixParfum = prixParfum;
		this.dateCreation = date;
	}
	
	private String imagePath;

	//@OneToOne
	//private Image image;
	
	@OneToMany (mappedBy = "parfum")
	private List<Image> images;
	
	public List<Image> getImages() {
		return images;
	}
	public void setImages(List<Image> images) {
		this.images = images;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idParfum;
	private String nomParfum;
	private Double prixParfum;
	private Date dateCreation;
	@ManyToOne
	private Famille famille;
	public Long getIdParfum() {
		return idParfum;
	}
	public void setIdParfum(Long idParfum) {
		this.idParfum = idParfum;
	}
	public String getNomParfum() {
		return nomParfum;
	}
	public void setNomParfum(String nomParfum) {
		this.nomParfum = nomParfum;
	}
	public Double getPrixParfum() {
		return prixParfum;
	}
	public void setPrixParfum(Double prixParfum) {
		this.prixParfum = prixParfum;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	public Famille getFamille() {
		return famille;
	}
	public void setFamille(Famille famille) {
		this.famille = famille;
	}
	@Override
	public String toString() {
		return "Parfum [idParfum=" + idParfum + ", nomParfum=" + nomParfum + ", prixParfum="
				+ prixParfum + ", dateCreation=" + dateCreation + ", famille=" + famille + "]";
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	
	
	


}
