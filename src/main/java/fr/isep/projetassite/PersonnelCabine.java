package fr.isep.projetassite;

import java.time.LocalDate;

public class PersonnelCabine extends Employe {
  private String qualification;

  public PersonnelCabine(String nom, String adresse, String contact, String numeroEmploye, LocalDate dateEmbauche,
      String qualification) {
    super(nom, adresse, contact, numeroEmploye, dateEmbauche);
    this.qualification = qualification;
  }

  @Override
  public String obtenirRole() {
    return "PersonnelCabine";
  }

  @Override
  public String obtenirInfos() {
    return super.obtenirInfos() + "\nRôle: " + obtenirRole() + " Qualification: "
        + this.qualification;
  }
}
