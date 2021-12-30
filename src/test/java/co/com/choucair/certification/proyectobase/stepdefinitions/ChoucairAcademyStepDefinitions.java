package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.academy.model.ChoucairData;
import co.com.choucair.certification.academy.questions.Final;
import co.com.choucair.certification.academy.tasks.Login;
import co.com.choucair.certification.academy.tasks.OpenUp;
import co.com.choucair.certification.academy.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Lorena wants to learn automation at the Academy Choucair$")
    public void thanLorenaWantsToLearnAutomationAtTheAcademyChoucair(List<ChoucairData> data) {
        OnStage.theActorCalled("Lorena").wasAbleTo(OpenUp.thePage(),(Login.onThePage(data)));
    }

    @When("^he search for the course Workshop de Automatizacion on the Choucair academy platform$")
    public void heSearchForTheCourseOnTheChoucairAcademyPlatform(List<ChoucairData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(data));
    }

    @Then("^he finds the course called resources Workshop de Automatizacion$")
    public void heFindsTheCourseCalledResourcesWorkshopdeAutomatizacion(List<ChoucairData> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Final.the(data)));
    }
}
