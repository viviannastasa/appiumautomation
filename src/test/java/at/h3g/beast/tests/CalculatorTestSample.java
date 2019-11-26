package at.h3g.beast.tests;


import at.h3g.beast.objects.ScreenObjectSample;
import at.h3g.beast.pages.BaseTest;
import at.h3g.beast.pages.objects.Dx3;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalculatorTestSample extends BaseTest {

    private String expectedResult = "Die Anzeige lautet 3.";

    @BeforeTest
    public void skip() {
    }

    @Test
    public void test() {

        Dx3.click(ScreenObjectSample.buttonOne);
        Dx3.click(ScreenObjectSample.buttonDecimal);
        Dx3.click(ScreenObjectSample.buttonFive);
        Dx3.click(ScreenObjectSample.buttonPlus);
        Dx3.click(ScreenObjectSample.buttonZero);
        Dx3.click(ScreenObjectSample.buttonDecimal);
        Dx3.click(ScreenObjectSample.buttonFive);
        Dx3.click(ScreenObjectSample.buttonPlus);
        Dx3.click(ScreenObjectSample.buttonOne);
        Dx3.click(ScreenObjectSample.buttonEquals);
        Assert.assertEquals(ScreenObjectSample.getCalculatorResult(), expectedResult);
    }

    @AfterTest
    public void after(){
    }
}