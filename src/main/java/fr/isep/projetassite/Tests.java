package fr.isep.projetassite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Tests {

  @Test
  void testGetImmatriculationAvion() {
    Avion avion = new Avion("F-ABCD", "Boeing 737", 200);
    assertEquals("F-ABCD", avion.getImmatriculation());
  }

  @Test
  void testDisponibiliteAvion() {
    Avion avion = new Avion("G-HGJZ", "Airbus A320", 150);
    assertTrue(avion.verifierDisponibilite());
  }

  @Test
  void testAnnulerReservation() {
    Passager passager = new Passager("Lopez", "Paris", "100000000", "AB12345");
    Reservation reservation = new Reservation("RES-999", passager);
    assertEquals("En attente", reservation.getStatut());
    reservation.annulerReservation();
    assertEquals("Annulée", reservation.getStatut());
  }
}