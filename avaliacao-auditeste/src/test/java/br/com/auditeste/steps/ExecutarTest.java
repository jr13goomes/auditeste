package br.com.auditeste.steps;

import br.com.auditeste.pages.Browser;
import br.com.auditeste.pages.HomePage;
import br.com.auditeste.utils.Actions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExecutarTest {

	Browser b = new Browser();
	Actions ac = new Actions(); 
	HomePage h = new HomePage();

	@Given("^que eu acesse o site$")
	public void que_eu_acesse_o_site() throws Throwable {
		b.abrirBrowser("CHROME", "https://www.auditeste.com.br/", "acessando o site");
	}

	@When("^clicar no \"([^\"]*)\" no header do site$")
	public void clicar_no_no_header_do_site(String arg1) throws Throwable {
        h.fecharPopup("validando pop-up");
		ac.clicarText(arg1, "clicar no menu ");
		
	}
	
	@Then("^valido \"([^\"]*)\" acessada$")
	public void valido_acessada(String arg1) throws Throwable {
	   ac.validarPagina(arg1, "validando página");
	   ac.screnShoot("./Evidencias/"+arg1+".png");
	   h.fecharBrowser("encerrando caso de teste");
	}

	
}
