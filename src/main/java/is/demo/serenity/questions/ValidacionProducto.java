package is.demo.serenity.questions;

import is.demo.serenity.utils.Excel;
import net.serenitybdd.screenplay.*;
import java.io.IOException;
import java.util.*;

import static is.demo.serenity.userInterface.DemoValidacionProductoUI.*;

public class ValidacionProducto implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        String producto="";
        try {
            ArrayList<Map<String, String>> datosExcel = Excel.leerDatosDeHojaDeExcel("datos/Data.xlsx", "Producto");
            producto = datosExcel.get(0).get("Nombre");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        List<String> listaProductos = BTN_TABLA.resolveAllFor(actor).texts();
        return listaProductos.contains(producto);
    }
    public static Question ValidacionProducto(){
        return new ValidacionProducto();
    }
}
