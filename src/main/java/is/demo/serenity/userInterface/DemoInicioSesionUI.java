package is.demo.serenity.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class DemoInicioSesionUI {
    public static final Target TXT_NOMBRE_USUARIO=Target.the("Nombre de usuario")
            .locatedBy("//*[@id='LoginPanel0_Username']");
    public static final Target TXT_CONTRASENA=Target.the("Contraseña")
            .locatedBy("//*[@id='LoginPanel0_Password']");

}
