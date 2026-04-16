package fr.isep.projetassite;

import java.time.LocalDate;

public class Employe extends Personne {
  private String numeroEmploye;
  private LocalDate dateEmbauche;

  public Employe(String nom, String adresse, String contact, String numeroEmploye, LocalDate dateEmbauche) {
    super(nom, adresse, contact);
    this.numeroEmploye = numeroEmploye;
    this.dateEmbauche = dateEmbauche;
  }

  @Override

  public String obtenirInfos() {
    return super.obtenirInfos() + "\nNuméro Employé: " + this.numeroEmploye + " Date d'embauche: " + this.dateEmbauche;
  }
}
