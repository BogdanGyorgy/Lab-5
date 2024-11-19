package exercitiul1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Persoana;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void scriere(List<NumerePereche> lista) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            File file = new File("src/main/resources/NumerePereche.json");

            mapper.writeValue(file, lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<NumerePereche> citire() {
        try {
            File file = new File("src/main/resources/NumerePereche.json");
            if (!file.exists()) {
                System.out.println("Fisierul JSON nu exista la calea specificata: " + file.getAbsolutePath());
                return new ArrayList<>();
            }
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(file, new TypeReference<List<NumerePereche>>() {});
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }


    public static void main(String[] args) {
        List<NumerePereche> lista = new ArrayList<>();

        List<NumerePereche> citita = citire();
        if (citita != null && !citita.isEmpty()) {
            for (NumerePereche pereche : citita) {
                System.out.println(pereche);
                System.out.println("Numere consecutive:"+ pereche.suntConsecutiveFibonacci() );
                System.out.println("CMMMC: " + pereche.cmmmc());
                System.out.println("Suma cifrelor egală: " + pereche.sumaCifre());
                System.out.println("Cifre pare egale: " + pereche.cifrePare());
            }
        } else {
            System.out.println("Lista citita este goala sau nu a putut fi incarcata.");
        }


    }


 }

