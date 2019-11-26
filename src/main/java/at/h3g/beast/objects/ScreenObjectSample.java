package at.h3g.beast.objects;

import at.h3g.beast.pages.objects.Dx3;
import org.openqa.selenium.By;

public class ScreenObjectSample {

    //Locators
        public static By buttonOne = By.xpath("//Button[@AutomationId='num1Button']");
        public static By buttonDecimal = By.xpath("//Button[@AutomationId='decimalSeparatorButton']");
        public static By buttonFive = By.xpath("//Button[@AutomationId='num5Button']");
        public static By buttonPlus = By.xpath("//Button[@AutomationId='plusButton']");
        public static By buttonZero = By.xpath("//Button[@AutomationId='num0Button']");
        public static By buttonEquals = By.xpath("//Button[@AutomationId='equalButton']");
        public static By resultBox = By.xpath("//*[@AutomationId='CalculatorResults']");

    //Actions
    public static String getCalculatorResult(){
        return Dx3.getText(resultBox);
    }

}
