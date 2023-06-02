package is.demo.serenity.task;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import static is.demo.serenity.userInterface.DemoSelecioneNuevoUI.BTN_NUEVOPRODUCTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DemoSelecioneNuevoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_NUEVOPRODUCTO)
        );
    }
    public static Performable DemoSelecioneNuevoTask(){
        return instrumented(DemoSelecioneNuevoTask.class);
    }
}
