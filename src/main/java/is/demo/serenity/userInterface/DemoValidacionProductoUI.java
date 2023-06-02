package is.demo.serenity.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class DemoValidacionProductoUI {

    public static final Target BTN_TABLA=Target.the("Tabla")
            .locatedBy("//*[@class='slick-cell l1 r1']");
    public static final Target TXT_BUSCAR=Target.the("buscar por categoria")
            .locatedBy("//*[@title='Ingrese el texto para buscar']");
}
