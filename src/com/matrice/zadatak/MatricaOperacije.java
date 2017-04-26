package com.matrice.zadatak;

public final class MatricaOperacije {
    public static Matrica ones(Matrica matrica) {
        Matrica ones = new Matrica(matrica.getDimenzijaM());
        for(int i = 0; i < ones.getDimenzijaN(); i++) {
            for(int j = 0; j < ones.getDimenzijaN(); j++) {
                ones.getMatrica()[i][j] = 1;
            }
        }
        return ones;
    }

    public static Matrica zeros(Matrica matrica) {
        Matrica zeros = new Matrica(matrica.getDimenzijaN());
        for(int i = 0; i < zeros.getDimenzijaM(); i++) {
            for(int j = 0; j < zeros.getDimenzijaN(); j++) {
                zeros.getMatrica()[i][j] = 0;
            }
        }
        return zeros;
    }

    public static Matrica sabiranjeMatrica(Matrica matrica1, Matrica matrica2) {
        Matrica sabranaMatrica;
        if (matrica1.getDimenzijaN()>= matrica2.getDimenzijaN()) {
            sabranaMatrica = saberi(matrica2, matrica1);
            return sabranaMatrica;
        }
        sabranaMatrica = saberi(matrica1, matrica2);
        return sabranaMatrica;
    }

    public static Matrica oduzimanjeMatrica(Matrica matrica1, Matrica matrica2) {
        Matrica sabranaMatrica;
        if (matrica1.getDimenzijaN() >= matrica2.getDimenzijaN()) {
            sabranaMatrica = oduzmi(matrica2, matrica1);
            return sabranaMatrica;
        }
        sabranaMatrica = oduzmi(matrica1, matrica2);
        return sabranaMatrica;
    }

    public static Matrica mnozenjeMatrica(Matrica matrica1, Matrica matrica2) {
        Matrica sabranaMatrica;
        if (matrica1.getDimenzijaN() >= matrica2.getDimenzijaN()) {
            sabranaMatrica = mnozi(matrica2, matrica1);
            return sabranaMatrica;
        }
        sabranaMatrica = mnozi(matrica1, matrica2);
        return sabranaMatrica;
    }

    public static Matrica mnozenjeBroj(Matrica matrica1, int zadatiBroj) {
        return mnoziBroj(matrica1, zadatiBroj);
    }

    public static Matrica uporediMatricu(Matrica matrica, String operacija, int vrednost) {
        int[][] uporedi = new int[matrica.getDimenzijaM()][matrica.getDimenzijaN()];

        for(int i = 0; i < matrica.getDimenzijaM(); i++) {
            for(int j = 0; j < matrica.getDimenzijaN(); j++) {
                boolean uporedjenaVrednost = uporediVrednost(matrica.getMatrica()[i][j], operacija, vrednost);
                if(uporedjenaVrednost) {
                    uporedi[i][j] = 1;
                } else {
                    uporedi[i][j] = 0;
                }
            }
        }
        Matrica uporedjenaMatrica = new Matrica(matrica.getDimenzijaM(), matrica.getDimenzijaN());
        uporedjenaMatrica.setMatrica(uporedi);
        return uporedjenaMatrica;
    }

    private static Matrica saberi(Matrica vecaMatrica, Matrica manjaMatrica) {
        int[][] saberi = new int[vecaMatrica.getDimenzijaM()][vecaMatrica.getDimenzijaN()];
        for(int i = 0; i < vecaMatrica.getDimenzijaM(); i++) {
            for(int j = 0; j < vecaMatrica.getDimenzijaN(); j++) {
                saberi[i][j] = vecaMatrica.getMatrica()[i][j] + manjaMatrica.getMatrica()[i][j];
            }
        }
        Matrica matrica = new Matrica(vecaMatrica.getDimenzijaM(), vecaMatrica.getDimenzijaN());
        matrica.setMatrica(saberi);
        return matrica;
    }

    private static Matrica oduzmi(Matrica vecaMatrica, Matrica manjaMatrica) {
        int[][] oduzmi = new int[vecaMatrica.getDimenzijaM()][vecaMatrica.getDimenzijaN()];
        for(int i = 0; i < vecaMatrica.getDimenzijaM(); i++) {
            for(int j = 0; j < vecaMatrica.getDimenzijaN(); j++) {
                oduzmi[i][j] = vecaMatrica.getMatrica()[i][j] - manjaMatrica.getMatrica()[i][j];
            }
        }
        Matrica matrica = new Matrica(vecaMatrica.getDimenzijaM(), vecaMatrica.getDimenzijaN());
        matrica.setMatrica(oduzmi);
        return matrica;
    }

    private static Matrica mnozi(Matrica vecaMatrica, Matrica manjaMatrica) {
        int[][] mnozi = new int[vecaMatrica.getDimenzijaM()][vecaMatrica.getDimenzijaN()];
        for(int i = 0; i < vecaMatrica.getDimenzijaN(); i++) {
            for(int j = 0; j < vecaMatrica.getDimenzijaN(); j++) {
                mnozi[i][j] = vecaMatrica.getMatrica()[i][j] * manjaMatrica.getMatrica()[j][i];
            }
        }
        Matrica matrica = new Matrica(vecaMatrica.getDimenzijaM(), vecaMatrica.getDimenzijaN());
        matrica.setMatrica(mnozi);
        return matrica;
    }

    private static Matrica mnoziBroj(Matrica matrica, int zadatiBroj) {
        int[][] mnozi = new int[matrica.getDimenzijaM()][matrica.getDimenzijaN()];
        for(int i = 0; i < matrica.getDimenzijaM(); i++) {
            for(int j = 0; j < matrica.getDimenzijaN(); j++) {
                mnozi[i][j] = matrica.getMatrica()[i][j] * zadatiBroj;
            }
        }
        Matrica matricaPomnozenaBrojem = new Matrica(matrica.getDimenzijaM(), matrica.getDimenzijaM());
        matricaPomnozenaBrojem.setMatrica(mnozi);
        return matricaPomnozenaBrojem;
    }

    private static boolean uporediVrednost(int matricaVrednost, String operacija, int vrednost ) {
        boolean isSame = false;
        switch (operacija) {
            case "=":
                isSame = matricaVrednost == vrednost;
                break;
            case "<":
                isSame = matricaVrednost < vrednost;
                break;
            case ">":
                isSame = matricaVrednost > vrednost;
                break;
            case "<=":
                isSame = matricaVrednost <= vrednost;
                break;
            case ">=":
                isSame = matricaVrednost >= vrednost;
                break;
            default:
                System.out.println("Nepoznata operacija(podrzane operacije: =, <, >, <=, >=).");
                System.exit(0);
        }
        return isSame;
    }
}
