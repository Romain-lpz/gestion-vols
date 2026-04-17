package fr.isep.projetassite;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Vol> listeDesVols = new ArrayList<>();
    List<Employe> listeDesEmployes = new ArrayList<>();
    List<Avion> listeDesAvions = new ArrayList<>();

    LocalDateTime depart = LocalDateTime.of(2026, 5, 10, 14, 0);
    LocalDateTime arrivee = LocalDateTime.of(2026, 5, 10, 16, 30);

    Vol vol1 = new Vol("AF123", "Paris", "Barcelone", depart, arrivee);
    listeDesVols.add(vol1);
    String idAAnnuler = "AF123";
    boolean volTrouve = false;
    for (Vol v : listeDesVols) {
      if (v.getNumeroVol().equals(idAAnnuler)) {
        v.annulerVol();
        System.out.println("Succès : Le vol " + idAAnnuler + " a est annulé.");
        volTrouve = true;
        break;
      }
    }

    if (!volTrouve) {
      System.out.println("Vol n'existe pas.");
    }
  }
}