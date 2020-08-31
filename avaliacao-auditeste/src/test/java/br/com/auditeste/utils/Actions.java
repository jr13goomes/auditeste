package br.com.auditeste.utils;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.auditeste.pages.Browser;

public class Actions extends Browser {

	public void screnShoot(String printName) throws IOException {
		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		// Move image file to new destination
		File DestFile = new File(printName);
		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}

	public void clicar(By element, String descricaoPasso) {

		driver.findElement(element).click();

	}
	
	public void clicarText(String text, String descriPasso) {
		
		driver.findElement(By.linkText(text)).click();
		
	}
	
	public void preencherCampo(By element,String texto, String descriPasso) {
		
		driver.findElement(element).sendKeys(texto);
		
	}

	public void esperarClicavel(By element, String descricaoPasso) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement elemento = wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	public void esperarElemento(By element, String descricaoPasso) {

		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(element));

	}
	
	public void validarPagina(String pagina, String descricaoPasso) {
		String pag = driver.getTitle();
		assertEquals(pagina, pag);
	}

}
