package com.enchere.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.Null;



@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@NamedQueries({
	@NamedQuery(name = "findAnnonceById", query = "select a from Annonces a where a.id= :id"),
	@NamedQuery(name = "findListAnnoncesByCategorieId", query = "select l from Annonces l where l.categorie.id= :idAnnonce"),
	

})
public class Annonces {

	
	
private int id;
private String titre;
private String description;


private float prix;
private Governorat governorat;
private List<Photo> photos;
private Client client ;
private TypeAnnonce typeAnnonce;
private CategorieAnnonces categorie;

@Id
@GeneratedValue(strategy=GenerationType.TABLE)
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}


@Null
public float getPrix() {
	return prix;
}
public void setPrix(float prix) {
	this.prix = prix;
}

@Null
@ManyToOne
public Governorat getGovernorat() {
	return governorat;
}
public void setGovernorat(Governorat governorat) {
	this.governorat = governorat;
}

@Null
@OneToMany(mappedBy="annonces")
public List<Photo> getPhotos() {
	return photos;
}
public void setPhotos(List<Photo> photos) {
	this.photos = photos;
}


@ManyToOne
public Client getClient() {
	return client;
}
public void setClient(Client client) {
	this.client = client;
}

@Null
@ManyToOne
public TypeAnnonce getTypeAnnonce() {
	return typeAnnonce;
}
public void setTypeAnnonce(TypeAnnonce typeAnnonce) {
	this.typeAnnonce = typeAnnonce;
}


@Null
@ManyToOne
public CategorieAnnonces getCategorie() {
	return categorie;
}
public void setCategorie(CategorieAnnonces categorie) {
	this.categorie = categorie;
}

}
