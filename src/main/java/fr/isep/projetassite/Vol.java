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
  private static List<Vol> tousLesVols = new ArrayList<>();

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

  public static void ajouterVol(Vol v) {
    tousLesVols.add(v);
  }

  // les CRUD
  public static Vol chercherVol(String numeroVol) {
    for (Vol v : tousLesVols) {
      if (v.getNumeroVol().equals(numeroVol)) {
        return v;
      }
    }
    return null;
  }

  public static void modifierVol(String numeroVol, String nouvelleDestination) {
    Vol v = chercherVol(numeroVol);
    if (v != null) {
      v.destination = nouvelleDestination;
    }
  }

  public static void supprimerVol(String numeroVol) {
    Vol v = chercherVol(numeroVol);
    if (v != null) {
      tousLesVols.remove(v);
    }
  }
}