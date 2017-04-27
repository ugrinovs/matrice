package com.matrice.zadatak;

public class Matrica {
    private int dimenzijaN = 0;
    private int dimenzijaM = 0;
    private int matrica[][];

    public Matrica(int kvadratnaMatricaDimenzija) {
        this.matrica = new int[kvadratnaMatricaDimenzija][kvadratnaMatricaDimenzija];
        this.dimenzijaM = kvadratnaMatricaDimenzija;
        this.dimenzijaN = kvadratnaMatricaDimenzija;
    }

    public Matrica(int dimenzijaM, int dimenzijaN) {
        this.matrica = new int[dimenzijaM][dimenzijaN];
        this.dimenzijaM = dimenzijaM;
        this.dimenzijaN = dimenzijaM;
    }

    public int getDimenzijaN() {
        return dimenzijaN;
    }

    public void setDimenzijaN(int dimenzijaN) {
        this.dimenzijaN = dimenzijaN;
    }

    public int getDimenzijaM() {
        return dimenzijaM;
    }

    public void setDimenzijaM(int dimenzijaM) {
        this.dimenzijaM = dimenzijaM;
    }

    public int[][] getMatrica() {
        return matrica;
    }

    public void setMatrica(int[][] matrica) {
        this.matrica = matrica;
    }
}
