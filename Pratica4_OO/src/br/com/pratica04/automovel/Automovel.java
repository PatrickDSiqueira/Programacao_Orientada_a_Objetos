package br.com.pratica04.automovel;

public class Automovel {

    private boolean abs;
    private boolean airBag;
    private boolean alarme;
    private boolean som;
    private boolean conjuntoEletrico;
    private boolean computadorBordo;
    private double precoBase;

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public boolean isAirBag() {
        return airBag;
    }

    public void setAirBag(boolean airBag) {
        this.airBag = airBag;
    }

    public boolean isAlarme() {
        return alarme;
    }

    public void setAlarme(boolean alarme) {
        this.alarme = alarme;
    }

    public boolean isSom() {
        return som;
    }

    public void setSom(boolean som) {
        this.som = som;
    }

    public boolean isConjuntoEletrico() {
        return conjuntoEletrico;
    }

    public void setConjuntoEletrico(boolean conjuntoEletrico) {
        this.conjuntoEletrico = conjuntoEletrico;
    }

    public boolean isComputadorBordo() {
        return computadorBordo;
    }

    public void setComputadorBordo(boolean computadorBordo) {
        this.computadorBordo = computadorBordo;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public double calcularPrecoFinal() {
        double percentuais = 0;

        percentuais += isAbs() ? 0.15 : 0;
        percentuais += isAirBag() ? 0.10 : 0;
        percentuais += isAlarme() ? 0.3 : 0;
        percentuais += isSom() ? 0.2 : 0;
        percentuais += isConjuntoEletrico() ? 0.5 : 0;
        percentuais += isComputadorBordo() ? 0.10 : 0;

        return (getPrecoBase() + (getPrecoBase() * percentuais));

    }

}