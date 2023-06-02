package is.demo.serenity.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class DemoSelecioneNuevoUI {
    public static final Target BTN_NUEVOPRODUCTO=Target.the("Selecione el boton nuevo producto")
            .locatedBy("//*[@class='tool-button add-button icon-tool-button']");
}
