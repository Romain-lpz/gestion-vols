package fr.isep.projetassite;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Reservation {
  private String numeroReservation;
  private LocalDateTime dateReservation;
  private String statut;
  private Passager passager;
  private List<Vol> volsReserves;
  private static List<Reservation> listeReservations = new ArrayList<>();

  public Reservation(String numeroReservation, Passager passager) {
    this.numeroReservation = numeroReservation;
    this.passager = passager;
    this.dateReservation = LocalDateTime.now();
    this.statut = "attente";
    this.volsReserves = new ArrayList<>();
  }

  public static void ajouter(Reservation r) {
    toutesLesReservations.add(r);
  }

  public static Reservation obtenirReservations(String id) {
    for (Reservation r : toutesLesReservations) {
      if (r.getNumeroReservation().equals(id)) {
        return r;
      }
    }
    return null;
  }

  public static void modifierStatut(String id, String nouveauStatut) {
    Reservation r = obtenirReservations(id);
    if (r != null) {
      r.statut = nouveauStatut;
    }
  }

  public static void annulerReservationID(String id) {
    Reservation r = obtenirReservations(id);
    if (r != null) {
      toutesLesReservations.remove(r);
    }
  }

  public void confirmerReservation() {
    this.statut = "Confirmée";
  }

  public void annulerReservation() {
    this.statut = "Annulée";
  }

  public void modifierReservation(LocalDateTime nouvelleDate) {
    this.dateReservation = nouvelleDate;
  }

  public void ajouterVol(Vol v) {
    this.volsReserves.add(v);
  }

  public String obtenirInfos() {
    StringBuilder sb = new StringBuilder();
    sb.append("Réservation N°: ").append(numeroReservation)
        .append(" | Statut: ").append(statut)
        .append("\nPassager: ").append(passager.getName())
        .append("\nVols inclus: ");
    for (Vol v : volsReserves) {
      sb.append(v.getNumeroVol()).append(" ");
    }
    return sb.toString();
  }

  public String getNumeroReservation() {
    return numeroReservation;
  }

}
