package utils;

import com.deque.axe.AXE;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.net.URL;

public class Accessibility extends driverInitiate {


    private static By footer_Link = By.linkText("Web hosting by Somee.com");
    private static final URL scriptUrl = Accessibility.class.getResource("/accessibility/axe.min.js");

    public void accessibilityViolationTest(String name)
    {
        JSONObject responseJson = new AXE.Builder(driver, scriptUrl).analyze();
        JSONArray violations = responseJson.getJSONArray("violations");

        int violationscount = violations.length();
        System.out.println("Total ViolationsCount: " + violationscount);

        for(int i=0; i<violationscount; i++) {
            JSONArray nodes = ((JSONObject) violations.get(i)).getJSONArray("nodes");
            String impact = (String) ((JSONObject) nodes.get(i)).get("impact");

            if (impact.equalsIgnoreCase("serious") || impact.equalsIgnoreCase("critical")) {
                AXE.writeResults(name, responseJson);
                Assert.assertTrue(AXE.report(violations), false);
            } else {
                System.out.println("Accessibility TEST is Passed! for "+name);
            }
        }
    }

    public void validateFooterLinks(String name)
    {
        Assert.assertTrue(String.valueOf(find(footer_Link).isDisplayed()),true);
        System.out.println(name + " Footer links are displayed");
    }
}
