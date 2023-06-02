package is.demo.serenity.task;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import static is.demo.serenity.userInterface.DemoTableroUI.BTN_PRODUCT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DemoTableroTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_PRODUCT)
        );
    }
    public static Performable DemoTableroTask(){
        return instrumented(DemoTableroTask.class);
    }
}
