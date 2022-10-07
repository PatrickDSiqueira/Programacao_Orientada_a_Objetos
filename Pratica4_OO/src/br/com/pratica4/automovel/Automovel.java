package br.com.pratica4.automovel;

public class Automovel {

    private int abs; 
    private int airBag;
    private int alarme; 
    private int som;
    private int conjuntoEletrico;
    private int computadorBordo;
    private double precoBase;

    public int getAbs() {
        return abs;
    }
    public void setAbs(int abs) {
        this.abs = abs;
    }
    public int getAirBag() {
        return airBag;
    }
    public void setAirBag(int airBag) {
        this.airBag = airBag;
    }
    public int getAlarme() {
        return alarme;
    }
    public void setAlarme(int alarme) {
        this.alarme = alarme;
    }
    public int getSom() {
        return som;
    }
    public void setSom(int som) {
        this.som = som;
    }
    public int getConjuntoEletrico() {
        return conjuntoEletrico;
    }
    public void setConjuntoEletrico(int conjuntoEletrico) {
        this.conjuntoEletrico = conjuntoEletrico;
    }
    public int getComputadorBordo() {
        return computadorBordo;
    }
    public void setComputadorBordo(int computadorBordo) {
        this.computadorBordo = computadorBordo;
    }
    
    public Automovel(int abs, int airBag, int alarme, int som, int conjuntoEletrico,
            int computadorBordo, double precoBase) {
        this.abs = abs;
        this.airBag = airBag;
        this.alarme = alarme;
        this.som = som;
        this.conjuntoEletrico = conjuntoEletrico;
        this.computadorBordo = computadorBordo;
        this.precoBase = precoBase;
    }
    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }
    public double getPrecoBase() {
        return precoBase;
    }
    public double calcularPrecoFinal(){
        
        // double precoFinal = (this.abs + this.airBag + this.alarme + this.som + this.conjuntoEletrico + this.computadorBordo);
    }

    }