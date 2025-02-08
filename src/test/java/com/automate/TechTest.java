package com.automate;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.handlers.FieldHandlers;

public class TechTest {

    WebDriver driver;
    String email, emailConfirm, password, url;
    FieldHandlers fieldHandlers = new FieldHandlers();

    public void setup() {

        driver = new ChromeDriver();
        email = "fulano@test.com";
        emailConfirm = "fulano@test.com";
        password = "SenhaForte123";
        url = ""
        
    }

    @Test
    public void getIntoSite() {

        try {

            driver.get(url);

            driver.findElement(By.id("")).sendKeys(email);
            driver.findElement(By.id("")).sendKeys(emailConfirm);
            driver.findElement(By.id("")).sendKeys(password);

            if (fieldHandlers.isValid(password)) {
                if (!email.isEmpty() && emailConfirm.equals(email)) {
                    driver.findElement(By.id()).sendKeys(Keys.ENTER);
                } else {
                    System.out.println("Confirmação de email deve ser igual a email e não pode estar vazio");
                }
            } else {
                System.out.println("Senha deve conta pelo menos 8 caracteres, 1 numero e uma letra maiuscula");
            }

        } catch (Exception e) {

            System.out.println("Algo deu Errado " + e);
        }

    }

    @After
    public void tearDown() {

        driver.quit();

    }

}
