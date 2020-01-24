package edu.escuelaing.arem.app;

import edu.escuelaing.arem.app.LinkedList;
import edu.escuelaing.arem.app.Estadisticas;

import java.io.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        File dataFile = null;
        if (args.length > 0){
            dataFile = new File(args[0]);
  
        try {
            BufferedReader br = new BufferedReader(new FileReader(dataFile));
            List<Double> linkedList = new LinkedList<Double>();
            String line;
            while ((line = br.readLine()) != null) {
                double num = Double.parseDouble(line);
                linkedList.add(num);
            }
            double mean = Estadisticas.Sumatoria(linkedList);
            double des = Estadisticas.Desviacion(linkedList);
            System.out.printf("El promedoi de los datos es: %.2f\nLa desviacion estandar es:%.2f\n", mean, des);
        } catch (FileNotFoundException e) {
            System.out.println("[WARNING] The file was not found.");
        }
        catch (IOException e) {
            System.out.println("[ERROR] The file couldn't be read.");
        }
    }
}    
}
