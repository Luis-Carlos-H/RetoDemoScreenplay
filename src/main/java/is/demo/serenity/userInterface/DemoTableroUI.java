package is.demo.serenity.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class DemoTableroUI {
    public static final Target BTN_PRODUCT=Target.the("Product Types")
            .locatedBy("(//*[@class='card-footer'])[4]");
}
