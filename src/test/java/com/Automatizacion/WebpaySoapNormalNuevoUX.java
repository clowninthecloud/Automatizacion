package com.Automatizacion;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.fail;

public class WebpaySoapNormalNuevoUX {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    private JavascriptExecutor js;

    @BeforeClass(alwaysRun = true)//Pre-condiciones
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\TBK\\Automatizacion\\src\\test\\resources\\windows\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com/";
        js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
    }

    //Casos de Prueba en ambiente Mantenciones
    @Test //OK
    public void testWebpaySoapNormalNuevoUX_001_Mastercard_Credito() throws Exception {
        driver.get("https://web5qa.test.transbank.cl:7443/ewebpay/jsf/welcome.jsf");
        Thread.sleep(2000);//para que no vaya tan rapido
        driver.findElement(By.xpath("//button[@id='ewebpayTestForm:tiendaNormal']/span")).click();
        driver.findElement(By.xpath("//form[@id='ewebpayTestForm']/table/tbody")).click();
        driver.findElement(By.id("ewebpayTestForm:ewptdAmount")).clear();
        driver.findElement(By.id("ewebpayTestForm:ewptdAmount")).sendKeys("1111");
        driver.findElement(By.xpath("//button[@id='ewebpayTestForm:initTransaction']/span")).click();
        WebDriverWait wait = new WebDriverWait(driver,30); //Este si me funciono bien
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#tarjetas"))).click();
        driver.findElement(By.id("card-number")).click();
        driver.findElement(By.id("card-number")).clear();
        driver.findElement(By.id("card-number")).sendKeys("5186174582209068");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Número de tarjeta'])[1]/following::button[1]")).click();


        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#card-exp")).sendKeys("1222");
        driver.findElement(By.id("card-cvv")).click();
        driver.findElement(By.id("card-cvv")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("card-cvv")).sendKeys("123");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[contains(text(),'Pagar')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Aceptar']"))).click();
        driver.findElement(By.xpath("//input[@value='Seguir (setResultAut)']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Seguir (retorno a Transbank)']")).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='j_idt47:j_idt52']/span"))).click();
        Thread.sleep(8000);

    }



    @Test //OK
    public void testWebpaySoapNormalNuevoUX_002_Visa_Credito() throws Exception {
        driver.get("https://web5qa.test.transbank.cl:7443/ewebpay/jsf/welcome.jsf");
        Thread.sleep(2000);//para que no vaya tan rapido
        driver.findElement(By.xpath("//button[@id='ewebpayTestForm:tiendaNormal']/span")).click();
        driver.findElement(By.xpath("//form[@id='ewebpayTestForm']/table/tbody")).click();
        driver.findElement(By.id("ewebpayTestForm:ewptdAmount")).clear();
        driver.findElement(By.id("ewebpayTestForm:ewptdAmount")).sendKeys("2222");
        driver.findElement(By.xpath("//button[@id='ewebpayTestForm:initTransaction']/span")).click();
        WebDriverWait wait = new WebDriverWait(driver,30); //Este si me funciono bien
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#tarjetas"))).click();
        driver.findElement(By.id("card-number")).click();
        driver.findElement(By.id("card-number")).clear();
        driver.findElement(By.id("card-number")).sendKeys("4455963807664298");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Número de tarjeta'])[1]/following::button[1]")).click();


        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#card-exp")).sendKeys("1222");
        driver.findElement(By.id("card-cvv")).click();
        driver.findElement(By.id("card-cvv")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("card-cvv")).sendKeys("123");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[contains(text(),'Pagar')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Aceptar']"))).click();
        driver.findElement(By.xpath("//input[@value='Seguir (setResultAut)']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Seguir (retorno a Transbank)']")).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='j_idt47:j_idt52']/span"))).click();
        Thread.sleep(8000);

    }

    @Test //OK
    public void testWebpaySoapNormalNuevoUX_003_Visa_Prepago() throws Exception {
        driver.get("https://web5qa.test.transbank.cl:7443/ewebpay/jsf/welcome.jsf");
        Thread.sleep(2000);//para que no vaya tan rapido
        driver.findElement(By.xpath("//button[@id='ewebpayTestForm:tiendaNormal']/span")).click();
        driver.findElement(By.xpath("//form[@id='ewebpayTestForm']/table/tbody")).click();
        driver.findElement(By.id("ewebpayTestForm:ewptdAmount")).clear();
        driver.findElement(By.id("ewebpayTestForm:ewptdAmount")).sendKeys("3333");
        driver.findElement(By.xpath("//button[@id='ewebpayTestForm:initTransaction']/span")).click();
        WebDriverWait wait = new WebDriverWait(driver,30); //Este si me funciono bien
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#tarjetas"))).click();
        driver.findElement(By.id("card-number")).click();
        driver.findElement(By.id("card-number")).clear();
        driver.findElement(By.id("card-number")).sendKeys("4670157970567383");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Número de tarjeta'])[1]/following::button[1]")).click();


        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#card-exp")).sendKeys("1222");
        driver.findElement(By.id("card-cvv")).click();
        driver.findElement(By.id("card-cvv")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("card-cvv")).sendKeys("123");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[contains(text(),'Pagar')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Aceptar']"))).click();
        driver.findElement(By.xpath("//input[@value='Seguir (setResultAut)']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Seguir (retorno a Transbank)']")).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='j_idt47:j_idt52']/span"))).click();
        Thread.sleep(8000);

    }

    @Test //VALIDAR TARJETA
    public void testWebpaySoapNormalNuevoUX_004_Mastercard_Prepago() throws Exception {
        driver.get("https://web5qa.test.transbank.cl:7443/ewebpay/jsf/welcome.jsf");
        Thread.sleep(2000);//para que no vaya tan rapido
        driver.findElement(By.xpath("//button[@id='ewebpayTestForm:tiendaNormal']/span")).click();
        driver.findElement(By.xpath("//form[@id='ewebpayTestForm']/table/tbody")).click();
        driver.findElement(By.id("ewebpayTestForm:ewptdAmount")).clear();
        driver.findElement(By.id("ewebpayTestForm:ewptdAmount")).sendKeys("4444");
        driver.findElement(By.xpath("//button[@id='ewebpayTestForm:initTransaction']/span")).click();
        WebDriverWait wait = new WebDriverWait(driver,30); //Este si me funciono bien
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#tarjetas"))).click();
        driver.findElement(By.id("card-number")).click();
        driver.findElement(By.id("card-number")).clear();
        driver.findElement(By.id("card-number")).sendKeys("5559120000003954");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Número de tarjeta'])[1]/following::button[1]")).click();


        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#card-exp")).sendKeys("1222");
        driver.findElement(By.id("card-cvv")).click();
        driver.findElement(By.id("card-cvv")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("card-cvv")).sendKeys("123");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[contains(text(),'Pagar')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Aceptar']"))).click();
        driver.findElement(By.xpath("//input[@value='Seguir (setResultAut)']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Seguir (retorno a Transbank)']")).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='j_idt47:j_idt52']/span"))).click();
        Thread.sleep(8000);

    }


    @Test //OK
    public  void testWebpaySoapNormalNuevoUX_005_Mastercard_Debito() throws Exception {
        driver.get("https://web5qa.test.transbank.cl:7443/ewebpay/jsf/welcome.jsf");
        Thread.sleep(2000);//para que no vaya tan rapido
        driver.findElement(By.xpath("//button[@id='ewebpayTestForm:tiendaNormal']/span")).click();
        driver.findElement(By.xpath("//form[@id='ewebpayTestForm']/table/tbody")).click();
        driver.findElement(By.id("ewebpayTestForm:ewptdAmount")).clear();
        driver.findElement(By.id("ewebpayTestForm:ewptdAmount")).sendKeys("5555");
        driver.findElement(By.xpath("//button[@id='ewebpayTestForm:initTransaction']/span")).click();
        WebDriverWait wait = new WebDriverWait(driver,30); //Este si me funciono bien
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#tarjetas"))).click();
        driver.findElement(By.id("card-number")).click();
        driver.findElement(By.id("card-number")).clear();
        driver.findElement(By.id("card-number")).sendKeys("5241010017372464");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Número de tarjeta'])[1]/following::button[1]")).click();
        Thread.sleep(2000);


        driver.findElement(By.id("card-dni")).click();
        driver.findElement(By.id("card-dni")).clear();
        driver.findElement(By.xpath("//input[@id='card-dni']")).sendKeys("11.111.111-1");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[contains(text(),'Pagar')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Aceptar']"))).click();
        driver.findElement(By.xpath("//input[@value='Seguir (setResultAut)']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Seguir (retorno a Transbank)']")).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='j_idt47:j_idt52']/span"))).click();
        Thread.sleep(8000);

    }


    @Test //OK
    public void testWebpaySoapNormalNuevoUX_006_Visa_Debito() throws Exception {
        driver.get("https://web5qa.test.transbank.cl:7443/ewebpay/jsf/welcome.jsf");
        Thread.sleep(2000);//para que no vaya tan rapido
        driver.findElement(By.xpath("//button[@id='ewebpayTestForm:tiendaNormal']/span")).click();
        driver.findElement(By.xpath("//form[@id='ewebpayTestForm']/table/tbody")).click();
        driver.findElement(By.id("ewebpayTestForm:ewptdAmount")).clear();
        driver.findElement(By.id("ewebpayTestForm:ewptdAmount")).sendKeys("6666");
        driver.findElement(By.xpath("//button[@id='ewebpayTestForm:initTransaction']/span")).click();
        WebDriverWait wait = new WebDriverWait(driver,30); //Este si me funciono bien
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#tarjetas"))).click();
        driver.findElement(By.id("card-number")).click();
        driver.findElement(By.id("card-number")).clear();
        driver.findElement(By.id("card-number")).sendKeys("4152816405800407");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Número de tarjeta'])[1]/following::button[1]")).click();
        Thread.sleep(2000);


        driver.findElement(By.id("card-dni")).click();
        driver.findElement(By.id("card-dni")).clear();
        driver.findElement(By.xpath("//input[@id='card-dni']")).sendKeys("11.111.111-1");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[contains(text(),'Pagar')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Aceptar']"))).click();
        driver.findElement(By.xpath("//input[@value='Seguir (setResultAut)']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Seguir (retorno a Transbank)']")).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='j_idt47:j_idt52']/span"))).click();
        Thread.sleep(8000);



    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
