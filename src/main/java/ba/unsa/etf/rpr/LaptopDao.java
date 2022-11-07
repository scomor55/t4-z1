package ba.unsa.etf.rpr;

import java.io.IOException;
import  java.util.ArrayList;
public  interface LaptopDao  {

    void dodajLaptopUListu(Laptop laptop);
    void dodajLaptopUFile(Laptop laptop)throws IOException;
    Laptop getLaptop();

    Laptop getLaptop(int i);

    void napuniListu(ArrayList<Laptop> laptopi);
    void dodajLaptopUListu();
    void vratiPodatkeIzDatoteke();

}
