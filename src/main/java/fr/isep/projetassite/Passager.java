package fr.isep.projetassite;

import java.util.ArrayList;
import java.util.List

public class Passager extends Personne {
  private String passeport;

  public Passager(String nom, String adresse, String contact, String passeport) {
    super(nom, adresse, contact);
    this.passeport = passeport;
  }

  @Override
  public String obtenirInfos() {
    return super.obtenirInfos() + " Passeport: " + this.passeport;
  }

  public void reserverVol() {
    System.out.println("reserver vol");
  }

  public void annulerReservation() {
    System.out.println("annuler resa");
  }

  public void obtenirReservations() {
    System.out.println("voire resa");
  }
}
