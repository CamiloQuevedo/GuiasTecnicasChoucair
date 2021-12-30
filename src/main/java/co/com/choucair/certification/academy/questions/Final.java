package co.com.choucair.certification.academy.questions;

import co.com.choucair.certification.academy.model.ChoucairData;
import co.com.choucair.certification.academy.userinterface.CourseChoucair;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Final implements Question<Boolean> {

    private List<ChoucairData> data;

    public Final(List<ChoucairData> data) {
        this.data = data;
    }

    public static Final the(List<ChoucairData> data) {
        return new Final(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String text_Complete= Text.of(CourseChoucair.FINAL_TEXT).viewedBy(actor).asString();
        return data.get(0).getStrFinalText().equals(text_Complete);
    }
}
