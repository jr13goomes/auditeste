package br.com.auditeste.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.auditeste.elementos.Elementos;
import br.com.auditeste.utils.Actions;

public class HomePage extends Browser {

	public void fecharPopup(String descricaoPasso) {

		boolean pop = driver.findElements(By.cssSelector("#sgpb-popup-dialog-main-div-wrapper > div > img")).size() > 0;

		if (pop) {

			driver.findElement(By.cssSelector("#sgpb-popup-dialog-main-div-wrapper > div > img")).click();

		}

	}

}
