package fr.isep.projetassite;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Vol {
  private String numeroVol;
  private String origine;
  private String destination;
  private LocalDateTime dateHeureDepart;
  private LocalDateTime dateHeureArrivee;
  private String etat;
  private Avion appareil;
  private List<Passager> listePassagers;
  private Pilote pilote;
  private List<PersonnelCabine> equipeCabine;

  public Vol(String numeroVol, String origine, String destination, LocalDateTime depart, LocalDateTime arrivee) {
    this.numeroVol = numeroVol;
    this.origine = origine;
    this.destination = destination;
    this.dateHeureDepart = depart;
    this.dateHeureArrivee = arrivee;
    this.etat = "Planifié";
    this.listePassagers = new ArrayList<>();
    this.equipeCabine = new ArrayList<>();
  }

  public void affecterEquipage(Pilote pilote, List<PersonnelCabine> equipeCabine) {
    this.pilote = pilote;
    this.equipeCabine = equipeCabine;
  }

  public void annulerVol() {
    this.etat = "Annulé";
  }

  public String getNumeroVol() {
    return this.numeroVol;
  }
}