package is.demo.serenity.task;

import is.demo.serenity.interactions.DatosExel;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import static is.demo.serenity.interactions.DatosExel.datosExcel;
import static is.demo.serenity.userInterface.DemoGuardarProductoUI.*;
import static is.demo.serenity.userInterface.DemoValidacionProductoUI.TXT_BUSCAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DemoGuardarProductoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        DatosExel.Datos("Producto");
        actor.attemptsTo(
                Enter.theValue(datosExcel.get(0).get("Nombre")).into(TXT_NOMBRE_PRODUCTO),
                Enter.theValue(datosExcel.get(0).get("UnidadesStock")).into(TXT_UNIDADES_STOCK),
                Enter.theValue(datosExcel.get(0).get("UnidadesPedido")).into(TXT_UNIDADES_PEDIDO),
                Enter.theValue(datosExcel.get(0).get("NivelReorden")).into(TXT_NIVEL_REORDEN),
                Click.on(BTN_GUARDAR),
                Enter.theValue(datosExcel.get(0).get("P")).into(TXT_BUSCAR)
                        .thenHit(Keys.ENTER)
        );
    }
    public static Performable DemoGuardarProductoTask(){
        return instrumented(DemoGuardarProductoTask.class);
    }

}
