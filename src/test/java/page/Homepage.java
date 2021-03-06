package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Homepage {

    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static WebElement element;
    protected JavascriptExecutor js;
    public static RegexStrings regexStringsObj;

    public void setWebDriver(WebDriver driver) {
        Homepage.driver = driver;
    } // end manual setter setWebDriver

    By dismissBtn_home = By.className("a-button-inner");
    By navLinks1_home = By.xpath("//a[contains(text(),\"Today's Deals\")]");
    By navLinks2_home = By.xpath("//a[contains(text(),'Customer Service')]");
    By navLinks3_home = By.xpath("//a[contains(text(),'Gift Cards')]");
    By navLinks4_home = By.xpath("//a[contains(text(),'Registry')]");
    By navLinks5_home = By.xpath("//body[1]/div[1]/header[1]/div[1]/div[4]/div[2]/div[2]/div[1]/a[5]");
    By navHamMenu_home = By.id("nav-hamburger-menu");
    By navHamMenuTitle1_home = By.xpath("//div[contains(text(),'digital content & devices')]");
    By navHamMenuTitle2_home = By.xpath("//div[contains(text(),'shop by department')]");
    By navHamMenuTitle3_home = By.xpath("//div[contains(text(),'programs & features')]");
    By navHamMenuTitle4_home = By.xpath("//div[contains(text(),'help & settings')]");
    By navHamMenuClose_home = By.xpath("//body/div[@id='hmenu-container']/div[@id='hmenu-canvas-background']/div[1]");
    By sectionShopCategory_home = By.xpath("//h2[contains(text(),'Shop by Category')]");
    By sectionShopCategories_home = By.xpath("//h2[contains(text(),'Shop top categories')]");
    By sectionDiscoverSite_home = By.xpath("//span[contains(text(),'Discover Amazon')]");
    By sectionTopBeautyProd_home = By.xpath("//span[contains(text(),'Top Beauty & Personal Care products')]");
    By sectionTopSellers_home = By.xpath("//span[contains(text(),'Amazon Top Sellers')]");
    By sectionComfyStyles_home = By.xpath("//h2[contains(text(),'Comfy styles for her')]");
    By sectionGifts_home = By.xpath("//span[contains(text(),'Gifts in Video Games under $30')]");
    By sectionMustHave_home = By.xpath("//span[contains(text(),'Must have Wireless products')]");
    By sectionStuffedToys_home = By.xpath("//span[contains(text(),'Stuffed Animals & Toys under $10')]");
    By sectionBestSellers_home = By.xpath("//span[contains(text(),'Best Sellers in Baby')]");
    By sectionFavToys_home = By.xpath("//span[contains(text(),'Our favorite Toys')]");
    By homeLogo = By.cssSelector("#nav-logo-sprites");

    public void viewHomepage() {

        String expectedTitle, actualTitle;

        expectedTitle = "Amazon.com. Spend less. Smile more.";
        try {
            actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");
            System.out.println("Page title: " + actualTitle);
        } catch (AssertionError e) {
            System.out.println("Test Failed!");
            Assert.fail("Message does not match");
        }

    } // end method viewHomepage()

    public void clickDismissBtnHome() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(dismissBtn_home)).click();
            System.out.println("Shipping Address Dismiss Button is clicked.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Shipping Address Dismiss Button is not available at the moment.");
        }

    } // end method clickDismissBtnHome

    public void clickNavLinks() {

        String expectedTitle1, actualTitle1, expectedTitle2, actualTitle2, expectedTitle3, actualTitle3, expectedTitle4, actualTitle4, expectedTitle5, actualTitle5;

        expectedTitle1 = "Today's Deals";
        try {
            element = driver.findElement(navLinks1_home);
            actualTitle1 = element.getText();
            Assert.assertEquals(actualTitle1, expectedTitle1, "Title does not match!");
            System.out.println("First navigation title: " + actualTitle1);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedTitle1 + " is not available at the moment.");
        }

        expectedTitle2 = "Customer Service";
        try {
            element = driver.findElement(navLinks2_home);
            actualTitle2 = element.getText();
            Assert.assertEquals(actualTitle2, expectedTitle2, "Title does not match!");
            System.out.println("Second navigation title: " + actualTitle2);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedTitle2 + " is not available at the moment.");
        }

        expectedTitle3 = "Gift Cards";
        try {
            element = driver.findElement(navLinks3_home);
            actualTitle3 = element.getText();
            Assert.assertEquals(actualTitle3, expectedTitle3, "Title does not match!");
            System.out.println("Third navigation title: " + actualTitle3);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedTitle3 + " is not available at the moment.");
        }

        expectedTitle4 = "Registry";
        try {
            element = driver.findElement(navLinks4_home);
            actualTitle4 = element.getText();
            Assert.assertEquals(actualTitle4, expectedTitle4, "Title does not match!");
            System.out.println("Fourth navigation title: " + actualTitle4);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedTitle4 + " is not available at the moment.");
        }

        expectedTitle5 = "Sell";
        try {
            element = driver.findElement(navLinks5_home);
            actualTitle5 = element.getText();
            Assert.assertEquals(actualTitle5, expectedTitle5, "Title does not match!");
            System.out.println("Fifth navigation title: " + actualTitle5);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedTitle5 + " is not available at the moment.");
        }

    } // end method clickNavLinks()

    public void clickNavHamMenu() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String expectedTitle1, actualTitle1, expectedTitle2, actualTitle2, expectedTitle3, actualTitle3, expectedTitle4, actualTitle4;

        try {
            driver.findElement(navHamMenu_home).click();
            System.out.println("\nHamburger menu is clicked.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Hamburger menu is not available at the moment.");
        }

        expectedTitle1 = "Digital Content & Devices";
        try {
            element = driver.findElement(navHamMenuTitle1_home);
            actualTitle1 = element.getText();
            Assert.assertEquals(actualTitle1, expectedTitle1, "Title does not match!");
            System.out.println("Navigation menu title: " + actualTitle1);
        } catch (Exception e) {
            System.out.println(expectedTitle1 + " navigation menu title is not available at the moment.");
        }

        expectedTitle2 = "Shop By Department";
        try {
            element = driver.findElement(navHamMenuTitle2_home);
            actualTitle2 = element.getText();
            Assert.assertEquals(actualTitle2, expectedTitle2, "Title does not match!");
            System.out.println("Navigation menu title: " + actualTitle2);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedTitle2 + " navigation menu title is not available at the moment.");
        }

        //js = (JavascriptExecutor) driver;
        //((JavascriptExecutor) driver).executeScript("javascript:window.scrollBy(0,350)", element);
        expectedTitle3 = "Programs & Features";
        try {
            element = driver.findElement(navHamMenuTitle3_home);
            actualTitle3 = element.getText();
            Assert.assertEquals(actualTitle3, expectedTitle3, "Title does not match!");
            System.out.println("Navigation menu title: " + actualTitle3);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedTitle3 + " navigation menu title is not available at the moment.");
        }

        expectedTitle4 = "Help & Settings";
        try {
            element = driver.findElement(navHamMenuTitle4_home);
            actualTitle4 = element.getText();
            Assert.assertEquals(actualTitle4, expectedTitle4, "Title does not match!");
            System.out.println("Navigation menu title: " + actualTitle4);
        } catch (Exception e) {
            System.out.println(expectedTitle4 + " navigation menu title is not available at the moment.");
        }

        try {
            element = wait.until(ExpectedConditions.elementToBeClickable(navHamMenuClose_home));
            element.click();
            System.out.println("Hamburger menu close button is clicked.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Hamburger menu close button is not available at the moment.");
        }

    } // end method clickNavHamMenu

    public void viewSections() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        js = (JavascriptExecutor) driver;
        String expectedTitle1, actualTitle1, expectedTitle2, actualTitle2, expectedTitle3, actualTitle3, expectedTitle4, actualTitle4, expectedTitle5, actualTitle5, expectedTitle6, actualTitle6, expectedTitle7, actualTitle7, expectedTitle8, actualTitle8, expectedTitle9, actualTitle9, expectedTitle10, actualTitle10, expectedTitle11, actualTitle11;

        expectedTitle1 = "Shop by Category";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(sectionShopCategory_home));
            actualTitle1 = element.getText();
            Assert.assertEquals(actualTitle1, expectedTitle1, "Title does not match!");
            System.out.println("\nSection title: " + actualTitle1);
        } catch (Exception e) {
            System.out.println(expectedTitle1 + " section title is not available at the moment.");
        }

        expectedTitle2 = "Shop top categories";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(sectionShopCategories_home));
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            actualTitle2 = element.getText();
            Assert.assertEquals(actualTitle2, expectedTitle2, "Title does not match!");
            System.out.println("Section title: " + actualTitle2);
        } catch (Exception e) {
            System.out.println(expectedTitle2 + " section title is not available at the moment.");
        }

        expectedTitle3 = "Discover Amazon";
        try {
            element = driver.findElement(sectionDiscoverSite_home);
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            actualTitle3 = element.getText();
            Assert.assertEquals(actualTitle3, expectedTitle3, "Title does not match!");
            System.out.println("Section title: " + actualTitle3);
        } catch (Exception e) {
            System.out.println(expectedTitle3 + " section title is not available at the moment");
        }

        expectedTitle4 = "Top Beauty & Personal Care products";
        try {
            element = driver.findElement(sectionTopBeautyProd_home);
            actualTitle4 = element.getText();
            Assert.assertEquals(actualTitle4, expectedTitle4, "Title does not match!");
            System.out.println("Section title: " + actualTitle4);
        } catch (Exception e) {
            System.out.println(expectedTitle4 + " section is not available at the moment.");
        }

        expectedTitle5 = "Amazon Top Sellers";
        try {
            element = driver.findElement(sectionTopSellers_home);
            actualTitle5 = element.getText();
            Assert.assertEquals(actualTitle5, expectedTitle5, "Title does not match!");
            System.out.println("Section title: " + actualTitle5);
        } catch (Exception e) {
            System.out.println(expectedTitle5 + " section is not available at the moment.");
        }

        expectedTitle6 = "Comfy styles for her";
        try {
            element = driver.findElement(sectionComfyStyles_home);
            actualTitle6 = element.getText();
            Assert.assertEquals(actualTitle6, expectedTitle6, "Title does not match!");
            System.out.println("Section title: " + actualTitle6);
        } catch (Exception e) {
            System.out.println(expectedTitle6 + "section is not available at the moment.");
        }

        expectedTitle7 = "Gifts in Video Games under $30";
        try {
            element = driver.findElement(sectionGifts_home);
            actualTitle7 = element.getText();
            Assert.assertEquals(actualTitle7, expectedTitle7, "Title does not match!");
            System.out.println("Section title: " + actualTitle7);
        } catch (Exception e) {
            System.out.println(expectedTitle7 + " section is not available at the moment.");
        }

        expectedTitle8 = "Must have Wireless products";
        try {
            element = driver.findElement(sectionMustHave_home);
            actualTitle8 = element.getText();
            Assert.assertEquals(actualTitle8, expectedTitle8, "Title does not match!");
            System.out.println("Section title: " + actualTitle8);
        } catch (Exception e) {
            System.out.println(expectedTitle8 + " section is not available at the moment.");
        }

        expectedTitle9 = "Stuffed Animals & Toys under $10";
        try {
            element = driver.findElement(sectionStuffedToys_home);
            actualTitle9 = element.getText();
            Assert.assertEquals(actualTitle9, expectedTitle9, "Title does not match!");
            System.out.println("Section title: " + actualTitle9);
        } catch (Exception e) {
            System.out.println(expectedTitle9 + " section is not available at the moment.");
        }

        expectedTitle10 = "Best Sellers in Baby";
        try {
            element = driver.findElement(sectionBestSellers_home);
            actualTitle10 = element.getText();
            Assert.assertEquals(actualTitle10, expectedTitle10, "Title does not match!");
            System.out.println("Section title: " + actualTitle10);
        } catch (Exception e) {
            System.out.println(expectedTitle10 + " section is not available at the moment.");
        }

        expectedTitle11 = "Our favorite Toys";
        try {
            element = driver.findElement(sectionFavToys_home);
            actualTitle11 = element.getText();
            Assert.assertEquals(actualTitle11, expectedTitle11, "Title does not match!");
            System.out.println("Section title: " + actualTitle11);
        } catch (Exception e) {
            System.out.println(expectedTitle11 + " section is not available at the moment.");
        }

    } // end method viewSections

    public void clickHome() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(homeLogo));
            element.click();
            System.out.println("Amazon logo is clicked.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\nHome logo is not available at the moment.");
        }

    } // end method clickHome()

} // end method Homepage
