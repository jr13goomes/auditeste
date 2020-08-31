package br.com.auditeste.elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	// Elementos do formulário de abertura de conta
	private By btnAbrirConta = By.cssSelector("body > div.viewport-primary > nav.nav-desktop > div.right > div.nav-item.nav-item-nova-conta > a");
	private By cpoNome = By.id("nome");
	private By cpoCelular = By.id("telefone");
	private By cpoEmail = By.id("email");
	private By cpoCpf = By.id("cpf");
	private By btnEnviar = By.id("btnEnviar");
	private By pesquisar = By.name("q");

	
	
	
	
	//Métodos
		


	public By getPesquisar() {
		return pesquisar;
	}


	public By getCpoCelular() {
		return cpoCelular;
	}


	public By getCpoEmail() {
		return cpoEmail;
	}


	public By getCpoCpf() {
		return cpoCpf;
	}
	

	public By getBtnAbrirConta() {
		return btnAbrirConta;
	}


	public By getCpoNome() {
		return cpoNome;
	}


	public By getBtnEnviar() {
		return btnEnviar;
	}

	
	
}
