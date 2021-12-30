package co.com.choucair.certification.academy.tasks;

import co.com.choucair.certification.academy.model.ChoucairData;
import co.com.choucair.certification.academy.userinterface.ChoucairLoginPage;
import co.com.choucair.certification.academy.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Search implements Task {

    private List<ChoucairData> data;

    public Search(List<ChoucairData> data) {
        this.data = data;
    }

    public static Search the(List<ChoucairData> course) {
        return Tasks.instrumented(Search.class,course);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchCoursePage.BUTTON_UC),
                Enter.theValue(data.get(0).getStrCourse()).into(SearchCoursePage.INPUT_COURSE),
                Click.on(SearchCoursePage.BUTTON_GO),
                Click.on(SearchCoursePage.SELECT_COURSE));
    }
}
