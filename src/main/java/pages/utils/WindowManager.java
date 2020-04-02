package pages.utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver driver;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
    }

    public void goBack() {
        driver.navigate().back();
    }

    public void goForward() {
        driver.navigate().forward();
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }

    public void foTo(String url) {
        driver.navigate().to(url);
    }

//    public void switchToTab(String tabTitle) {
//        var windows = driver.getWindowHandles();
//        System.out.println("There are : " + windows.size() + "Windows open");
//        System.out.println("Windows handles:");
//        windows.forEach(System.out::println);
//        for (String window : windows) {
//            System.out.println("Switching to window: " + window);
//            driver.switchTo().window(window);
//            System.out.println("Current window title: " + driver.getTitle());
//            if (tabTitle.equals(driver.getTitle())) {
//                break;
//            }
//        }
//
//    }

    public void switchToNewTab() {
        var windows = driver.getWindowHandles();
        windows.forEach(driver.switchTo()::window);
    }
}
