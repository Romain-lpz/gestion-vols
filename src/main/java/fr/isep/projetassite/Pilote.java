package fr.isep.projetassite;

import java.time.LocalDate;

public class Pilote extends Employe {
  private String licence;
  private int heureDeVol;

  public Pilote(String nom, String adresse, String contact, String numeroEmploye, LocalDate dateEmbauche,
      String licence, int heureDeVol) {
    super(nom, adresse, contact, numeroEmploye, dateEmbauche);
    this.licence = licence;
    this.heureDeVol = heureDeVol;
  }

  @Override
  public String obtenirRole() {
    return "Pilote";
  }

  @Override
  public String obtenirInfos() {
    return super.obtenirInfos() + "\nRôle: " + obtenirRole() + " Licence: " + this.licence + " Heures de vol: "
        + this.heureDeVol;
  }
}
