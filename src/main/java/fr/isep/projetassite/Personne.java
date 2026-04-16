package fr.isep.projetassite;

import java.util.UUID;

public class Personne {
  private UUID identifiant;
  private String nom;
  private String adresse;
  private String contact;

  public Personne(String Nom, String adresse, String contact) {
    this.nom = Nom;
    this.adresse = adresse;
    this.identifiant = UUID.randomUUID();
    this.Contact = contact;
  }

  public String getName() {
    return this.nom;
  }

  public String getAdresse() {
    return this.adresse;
  }

  public UUID getIdentifiant() {
    return this.identifiant;
  }

  public String getContact() {
    return this.contact;
  }

  public String obtenirInfos() {
    return " Nom: " + getName() + "Adresse: " + getAdresse()
        + "Contact: " + getContact() + "ID: " + getIdentifiant().toString();
  }
}
