package pages;

import org.openqa.selenium.By;
import utils.driverInitiate;

public class Employee extends driverInitiate {

    private static By Name = By.id("Name");
    private static By Salary = By.id("Salary");
    private static By DurationWorked = By.id("DurationWorked");
    private static By Grade = By.id("Grade");
    private static By Email = By.id("Email");
    private static By CreateButton = By.cssSelector(".btn-default");

    public void enter_name(String name)
    {
        find(Name).sendKeys(name);
    }

    public void enter_Salary(String salary)
    {
        find(Salary).sendKeys(salary);
    }

    public void select_durationworked(String duration)
    {
        find(DurationWorked).sendKeys(duration);
    }

    public void select_grade(String grade)
    {
        find(Grade).sendKeys(grade);
    }

    public void enter_Email(String email)
    {
        find(Email).sendKeys(email);
    }
    public void click_createButton()
    {
        find(CreateButton).click();
    }
}
