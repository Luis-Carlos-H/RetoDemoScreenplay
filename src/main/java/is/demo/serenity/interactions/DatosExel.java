package is.demo.serenity.interactions;

import is.demo.serenity.utils.Excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class DatosExel {
    public static ArrayList<Map<String, String>> datosExcel= new ArrayList<>();
    public static ArrayList<Map<String, String>> Datos(String hojaExcel){
        try {
            datosExcel = Excel.leerDatosDeHojaDeExcel("datos/Data.xlsx", hojaExcel);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return datosExcel;
    }
}
