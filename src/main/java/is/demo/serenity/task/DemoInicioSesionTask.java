package is.demo.serenity.task;

import is.demo.serenity.interactions.DatosExel;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import static is.demo.serenity.interactions.DatosExel.datosExcel;
import static is.demo.serenity.userInterface.DemoInicioSesionUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DemoInicioSesionTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        DatosExel.Datos("InicioSesion");
        actor.attemptsTo(
                Enter.theValue(datosExcel.get(0).get("Usuario")).into(TXT_NOMBRE_USUARIO),
                Enter.theValue(datosExcel.get(0).get("Contrasena")).into(TXT_CONTRASENA)
                        .thenHit(Keys.ENTER)
        );
    }
    public static Performable DemoInicioSesionTask(){
        return instrumented(DemoInicioSesionTask.class);
    }
}
