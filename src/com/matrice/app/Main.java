package com.matrice.app;

import com.matrice.zadatak.Matrica;
import com.matrice.zadatak.MatricaOperacije;

public class Main {

    public static void main(String[] args) {
        int[][] matricaVrednosti1 = napraviMatricu(new int[5][5], 0);
        int[][] matricaVrednosti2 = napraviMatricu(new int[5][5], 1);
        Matrica matrica1 = new Matrica(5);
        Matrica matrica2 = new Matrica(5);
        matrica1.setMatrica(matricaVrednosti1);
        matrica2.setMatrica(matricaVrednosti2);

        Matrica onesMatrica = MatricaOperacije.ones(matrica1);
        Matrica zeroesMatrica = MatricaOperacije.zeros(matrica1);
        Matrica saberiMatrice = MatricaOperacije.sabiranjeMatrica(matrica1, matrica2);
        Matrica oduzmiMatrice = MatricaOperacije.oduzimanjeMatrica(matrica1, matrica2);
        Matrica pomnozenjeMatrice = MatricaOperacije.mnozenjeMatrica(matrica1, matrica2);
        Matrica matricaPomnozenaBrojem = MatricaOperacije.mnozenjeBroj(matrica1, 2);
        Matrica uporedjenaMatrica = MatricaOperacije.uporediMatricu(matrica1, ">=", 5);
        System.out.println("Pocetna matrica 1");
        prikaziMatricu(matrica1);
        System.out.println("Pocetna matrica 2");
        prikaziMatricu(matrica2);
        System.out.println("Ones matrica");
        prikaziMatricu(onesMatrica);
        System.out.println("Zeroes matrica");
        prikaziMatricu(zeroesMatrica);
        System.out.println("Sabrana matrica");
        prikaziMatricu(saberiMatrice);
        System.out.println("Oduzeta matrica");
        prikaziMatricu(oduzmiMatrice);
        System.out.println("Pomnozene matrice");
        prikaziMatricu(pomnozenjeMatrice);
        System.out.println("Pomnozeno brojem");
        prikaziMatricu(matricaPomnozenaBrojem);
        System.out.println("Uporedjena matrica");
        prikaziMatricu(uporedjenaMatrica);
    }

    private static int[][] napraviMatricu(int[][] matricaVrednosti, int povecanje) {
        int[][] matrica = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrica[i][j] = j + i + povecanje;
            }
        }
        return matrica;
    }

    private static void prikaziMatricu(Matrica zeroesMatrica) {
        for(int i = 0; i < zeroesMatrica.getMatrica().length; i++) {
            for(int j = 0; j < zeroesMatrica.getMatrica()[i].length; j++) {
                System.out.print(zeroesMatrica.getMatrica()[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
