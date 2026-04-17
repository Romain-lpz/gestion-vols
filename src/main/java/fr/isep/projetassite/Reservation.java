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

}
