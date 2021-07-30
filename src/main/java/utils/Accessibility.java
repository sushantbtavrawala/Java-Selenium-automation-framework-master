package utils;

import com.deque.axe.AXE;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

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

    public void validateFooterLinks()
    {
        Assert.assertTrue(String.valueOf(find(footer_Link).isDisplayed()),true);
        System.out.println("Footer links are displayed");
    }

    public void validateLinks() throws IOException {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total Number of Links: " + links.size());

        List<String> urlList = new ArrayList<String>();

        for (WebElement e : links){
            String url = e.getAttribute("href");
            urlList.add(url);
        }
        urlList.parallelStream().forEach(e->validateBrokenLinks(e));
    }

    public void validateBrokenLinks(String linkUrl)  {

        try {
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.connect();

            if (httpURLConnection.getResponseCode() >= 400) {
                System.out.println("Broken: --> " + linkUrl + "--> " + httpURLConnection.getResponseMessage());
            } else {
                System.out.println("Active: --> " + linkUrl + "--> " + httpURLConnection.getResponseMessage());
            }
        }
        catch (Exception e){

        }
    }

    public void validateTitle()
    {
        String title = driver.getTitle();
        Assert.assertTrue(driver.getPageSource().contains(title));
        System.out.println("PageTitle is: " + title + " Displayed.");
    }
}
