package tests;


import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DadosDiretorTest {
    @Test
    public void testAdicionarUmaInformacaoDoDiretor () {
        // Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\C3PO\\drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Navegando para o Google
        navegador.get("http://www.google.com");

        // Clicar no botão Pesquisar com name "q"
        navegador.findElement(By.name("q")).click();

        // Digitar no campo com name "q" o texto "Mike Cahill I Origins"
        navegador.findElement(By.name("q")).sendKeys("Mike Cahill I Origins");

        // Clicar no link com o texto "Pesquisa Google" com name "btnK"
        WebElement UUbT9 = navegador.findElement(By.className("UUbT9"));
        WebElement btnK = navegador.findElement(By.name("btnK"));
        btnK.click();

        // Validar que dentro do elemento com id "resultStats" esteja "Aproximadamente 356.000 resultados" dentro de tantos segundos
        WebElement resultStats = navegador.findElement(By.id("resultStats"));
        String textoNoElementoResultStats = resultStats.getText();
        assertTrue(textoNoElementoResultStats.contains("Aproximadamente"));

        // Fechar o navegador
        navegador.quit();


    }
}
