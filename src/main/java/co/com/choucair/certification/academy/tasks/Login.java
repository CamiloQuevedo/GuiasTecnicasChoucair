package co.com.choucair.certification.academy.tasks;

import co.com.choucair.certification.academy.model.ChoucairData;
import co.com.choucair.certification.academy.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Login implements Task {

    private List<ChoucairData> data;

    public List<ChoucairData> getData() {
        return data;
    }

    public void setData(List<ChoucairData> data) {
        this.data = data;
    }

    public Login(List<ChoucairData> data) {
        this.data = data;
    }

    public static Login onThePage(List<ChoucairData> data) {
        return Tasks.instrumented(Login.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue(data.get(0).getStrUser()).into(ChoucairLoginPage.INPUT_USER),
                Enter.theValue(data.get(0).getStrPassword()).into(ChoucairLoginPage.INPUT_PASSWORD),
                Click.on(ChoucairLoginPage.ENTER_BUTTON));
    }

}
