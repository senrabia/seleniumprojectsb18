package test.Exercises.Day4;

import org.openqa.selenium.WebDriver;
import utulities.WebDriverFactory;

public class RadioButton_DWLady {
    public static void main(String[] args) {

        //Practice:	Cybertek	Checkboxes
        //1.Go	to	http://practice.cybertekschool.com/checkboxes
        //2.Confirm	checkbox	#1	is	NOT	selected	by	default
        //3.Confirm	checkbox	#2	is	SELECTED	by	default.
        //4.Click	checkbox	#1	to	select	it.
        //5.Click	checkbox	#2	to	deselect	it.
        //6.Confirm	checkbox	#1	is	SELECTED.
        //7.Confirm	checkbox	#2	is	NOT
        /*    //tagName[@attribute='attributevalue']
              //*[

         */

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize(); //INTERWIEW QUESTION
        driver.get("http://practice.cybertekschool.com/checkboxes");
        //tagName[@attribute='attributevalue']

    }
}

