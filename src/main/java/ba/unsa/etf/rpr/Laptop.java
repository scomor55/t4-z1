package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.io.IOException;

public class Laptop implements LaptopDao{
    private String model;
    private String brend;
    private int cijena;
    private int ram;
    private int hdd;
    private int ssd;
    private String procesor;
    private String grafickaKartica;
    private double velicinaEkrana;
    private ArrayList<Laptop> laptopi;
    public Laptop(String model) {
        this.model = model;
    }

    public String getBrend() {
        return brend;
    }

    public String getGrafickaKartica() {
        return grafickaKartica;
    }

    public int getCijena() {
        return cijena;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public int getSsd() {
        return ssd;
    }

    public String getProcesor() {
        return procesor;
    }

    public double getVelicinaEkrana() {
        return velicinaEkrana;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public void setGrafickaKartica(String grafickaKartica) {
        this.grafickaKartica = grafickaKartica;
    }

    public void setVelicinaEkrana(double velicinaEkrana) {
        this.velicinaEkrana = velicinaEkrana;
    }


    @Override
    public void dodajLaptopUListu(Laptop laptop) {

    }

    @Override
    public void dodajLaptopUFile(Laptop laptop) {

    }

    @Override
    public Laptop getLaptop() {
        return null;
    }

    @Override
    public Laptop getLaptop(int i) {
        return null;
    }

    @Override
    public void napuniListu(ArrayList<Laptop> laptopi) {

    }

    @Override
    public void dodajLaptopUListu() {

    }

    @Override
    public void vratiPodatkeIzDatoteke() {

    }
}
