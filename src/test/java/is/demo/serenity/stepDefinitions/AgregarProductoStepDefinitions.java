package is.demo.serenity.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import is.demo.serenity.questions.ValidacionProducto;
import is.demo.serenity.task.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AgregarProductoStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }
    @Dado("que el usuario abra la url en el navegador")
    public void queElUsuarioAbraLaUrlEnElNavegador() {
        theActorCalled("Usuario").wasAbleTo(
                Open.url("https://demo.serenity.is/")
        );
    }
    @Cuando("el usuario inicie sesion")
    public void elUsuarioInicieSesion() {
        theActorInTheSpotlight().attemptsTo(
                DemoInicioSesionTask.DemoInicioSesionTask()
        );
    }
    @Cuando("selecione More info de Producto Types")
    public void selecioneMoreInfoDeProductoTypes() {
        theActorInTheSpotlight().attemptsTo(
                DemoTableroTask.DemoTableroTask()
        );
    }
    @Cuando("selecione producto nuevo")
    public void selecioneProductoNuevo() {
        theActorInTheSpotlight().attemptsTo(
                DemoSelecioneNuevoTask.DemoSelecioneNuevoTask()
        );
    }
    @Cuando("Guarde un nuevo producto")
    public void guardeUnNuevoProducto() {
        theActorInTheSpotlight().attemptsTo(
                DemoGuardarProductoTask.DemoGuardarProductoTask()
        );
    }
    @Entonces("visualizara el nuevo producto en la lista de productos")
    public void visualizaraElNuevoProductoEnLaListaDeProductos() {
        theActorInTheSpotlight().should(
                seeThat(
                        "Se visualiza el titulo del producto",
                        ValidacionProducto.ValidacionProducto(),
                        Matchers.equalTo(true)
                )
        );
    }

}
