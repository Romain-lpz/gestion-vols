package fr.isep.projetassite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;

public class Lecture {

  public static void importerVols(String path) {

    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
      String ligne;

      while ((ligne = reader.readLine()) != null) {
        String[] donnees = ligne.split(",");
        if (donnees.length == 5) {
          String numeroVol = donnees[0];
          String origine = donnees[1];
          String destination = donnees[2];
          LocalDateTime depart = LocalDateTime.parse(donnees[3]);
          LocalDateTime arrivee = LocalDateTime.parse(donnees[4]);
          Vol nouvVol = new Vol(numeroVol, origine, destination, depart, arrivee);
          Vol.ajouterVol(nouvVol);
        }
      }

    } catch (IOException e) {
      System.err.println("Une erreur est survenue pendant la lecture du fichier: " + e.getMessage());
    }
  }
}