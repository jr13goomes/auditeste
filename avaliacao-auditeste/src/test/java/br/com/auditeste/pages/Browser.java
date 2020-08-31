package br.com.auditeste.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
protected static WebDriver driver;
	
	

	public void abrirBrowser(String navegador, String site, String descricaoPasso) {

		if (navegador == "CHROME" || navegador == "FIREFOX") {

			switch (navegador) {

			case "CHROME":
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(site);
				break;
			case "FIREFOX":
				System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
				driver = new FirefoxDriver();
				driver.get(site);
				break;

			}
		} else {
			System.out.println("Opção inválida, escolha FIREFOX ou CHROME ");
		}
		System.out.println("Iniciando o passo " + descricaoPasso);

	}

	public void fecharBrowser(String descriPasso) {

		driver.quit();

		System.out.println("Finalizando o passo " + descriPasso);
	}


	
	public void click(By element) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(element).click();
				
	}
	

}
