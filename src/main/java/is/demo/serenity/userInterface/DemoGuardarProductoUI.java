package is.demo.serenity.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class DemoGuardarProductoUI {
    public static final Target TXT_NOMBRE_PRODUCTO=Target.the("Nombre del producto")
            .locatedBy("(//*[@name='ProductName'])[1]");
    public static final Target TXT_UNIDADES_STOCK=Target.the("Unidades en Stock")
            .locatedBy("//*[@name='UnitsInStock']");
    public static final Target TXT_UNIDADES_PEDIDO=Target.the("Unidades en pedido")
            .locatedBy("//*[@name='UnitsOnOrder']");
    public static final Target TXT_NIVEL_REORDEN=Target.the("Nivel de Reorden")
            .locatedBy("//*[@name='ReorderLevel']");
    public static final Target BTN_GUARDAR=Target.the("Guardar")
            .locatedBy("//*[@class='tool-button save-and-close-button icon-tool-button']");

}
