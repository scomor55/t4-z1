package ba.unsa.etf.rpr;

import com.fasterxml.jackson.databind.json.JsonMapper;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class LaptopDaoJSONFile implements LaptopDao{

    private ArrayList<Laptop> laptopi;
    private File file;

    @Override
    public void dodajLaptopUListu(Laptop laptop) {
        laptopi.add(laptop);
    }

    @Override
    public void dodajLaptopUFile(Laptop laptop) throws IOException {
        JsonMapper novi = new JsonMapper();
        FileOutputStream f = new FileOutputStream(file);
        String s = novi.writeValueAsString(laptop);
        f.write(s.getBytes());
        f.close();
    }

    @Override
    public Laptop getLaptop() {
        return laptopi.get(0);
    }

    @Override
    public Laptop getLaptop(int i) {
        return laptopi.get(i);
    }
    Laptop racunar;
    @Override
    public void napuniListu(ArrayList<Laptop> laptopi) {
        for(int i = 0; i < laptopi.size() ; i++){
            laptopi.add(racunar);
        }
    }

    @Override
    public void dodajLaptopUListu() {
        laptopi.add(racunar);
    }

    @Override
    public void vratiPodatkeIzDatoteke() {
        JsonMapper novi = new JsonMapper();
        try {
            FileOutputStream f = new FileOutputStream(novi.toString());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
