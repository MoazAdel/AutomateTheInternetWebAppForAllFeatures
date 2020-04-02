package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.alertspack.AlertsPage;
import pages.alertspack.FileUploadPage;
import pages.dynamicpack.DynamicLoadingPage;
import pages.gorgotpasspack.ForgotPasswordPage;
import pages.hoverspack.HoversPage;
import pages.js_pack.InfiniteScrollPage;
import pages.js_pack.LargeAndDeepDomPage;
import pages.loginpack.LoginPage;
import pages.practice.DragAndDrop;
import pages.selfexercise.*;

public class HomePage {
    private WebDriver driver;

    //Home Page Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Navigate to the Login Page
    public LoginPage navigateToFormAuthenticationPage() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    //Navigate to Dropdown Page
    public DropdownPage navigateToDropdownPage() {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    //Navigate to Forget Password Page
    public ForgotPasswordPage navigateToForgotPasswordPage() {
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    //Navigate to Hovers Page
    public HoversPage navigateToHoversPage() {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    //Navigate To Key Presses Page
    public KeyPressesPage navigateToKeyPressesPage() {
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    //Navigate To HorizontalSliderPage
    public HorizontalSliderPage navigateToHorizontalPage() {
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    //Navigate To Alerts Page
    public AlertsPage navigateToAlertsPage() {
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    //Navigate To File Upload Page
    public FileUploadPage navigateToFileUploadPage() {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    //Navigate To Entry Ad Page
    public EntryAdPage navigateToEntryAdPage() {
        clickLink("Entry Ad");
        return new EntryAdPage(driver);
    }

    //Navigate to Context Menu Page
    public ContextMenuPage navigateToContextMenuPage() {
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    //Navigate to Wysiwyg Editor Page
    public WysiwygEditorPage navigateToWysiwygEditorPage() {
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }

    //Navigate to Frames Page
    public Frames navigateToFramesPage() {
        clickLink("Frames");
        return new Frames(driver);
    }

    //Navigate to Dynamic Page Loading
    public DynamicLoadingPage navigateToDynamicPage() {
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    //Navigate to Large And DeepDom Page
    public LargeAndDeepDomPage navigateToLargeAndDeepDomPage() {
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }

    //Navigate to Infinite Scroll Page
    public InfiniteScrollPage navigateToInfiniteScrollPage() {
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    //Navigate to multiple Windows
    public MultipleWindowsPage navigateToMultipleWindowsPage() {
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }

    //Navigate to Drag and Drop Page
    public DragAndDrop navigateToDragAndDropPage() {
        clickLink("Drag and Drop");
        return new DragAndDrop(driver);
    }

    //Navigate To Add Remove Elements
    public AddRemoveElementsPage navigateToAddRemovePage() {
        clickLink("Add/Remove Elements");
        return new AddRemoveElementsPage(driver);
    }

    //Navigate to Broken Images Page
    public BrokenImagesPage navigateToBrokenImagesPage() {
        clickLink("Broken Images");
        return new BrokenImagesPage(driver);
    }

    //Navigate to CheckBoxPage
    public CheckboxesPage navigateToCheckBoxesPage() {
        clickLink("Checkboxes");
        return new CheckboxesPage(driver);
    }

    //Navigate To Dynamic Control Page
    public DynamicControlsPage navigateToDynamicControlsPage() {
        clickLink("Dynamic Controls");
        return new DynamicControlsPage(driver);
    }

    //Navigate To Exit Intent Page
    public ExitIntentPage navigateToExitIntentPage() {
        clickLink("Exit Intent");
        return new ExitIntentPage(driver);
    }

    //Navigate To Exit Intent Page
    public DownloadFilesPage navigateToDownloadPage() {
        clickLink("File Download");
        return new DownloadFilesPage(driver);
    }

    //Navigate to Floating Menu
    public FloatingMenuPage navigateToFloatingMenupage() {
        clickLink("Floating Menu");
        return new FloatingMenuPage(driver);
    }

    //Navigate to Floating Menu
    public GeoLocationPage navigateToGeoLocationPage() {
        clickLink("Geolocation");
        return new GeoLocationPage(driver);
    }

    /**
     * Method which Click on a link founded by LinkText to navigate to the desired page
     *
     * @param linkText Which will be replaced by the link text
     */
    public void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

}
