package drivers;

import com.codeborne.selenide.WebDriverProvider;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import config.BrowserstackAndroidConfig;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackMobileDriver implements WebDriverProvider {
    static BrowserstackAndroidConfig config = ConfigFactory.create(BrowserstackAndroidConfig.class);
    
    @Override
    public WebDriver createDriver(Capabilities capabilities) {
        MutableCapabilities mutableCapabilities = new MutableCapabilities();
        mutableCapabilities.merge(capabilities);
        mutableCapabilities.setCapability("browserstack.user", config.login());
        mutableCapabilities.setCapability("browserstack.key", config.password());
        mutableCapabilities.setCapability("app", config.appUrl());
        mutableCapabilities.setCapability("device", config.device());
        mutableCapabilities.setCapability("os_version", config.osVersion());
        mutableCapabilities.setCapability("project", config.projectName());
        mutableCapabilities.setCapability("build", config.buildName());
        mutableCapabilities.setCapability("name", config.testName());
        return new RemoteWebDriver(getBrowserstackUrl(), mutableCapabilities);
    }

    public static URL getBrowserstackUrl() {
        try {
            return new URL(config.baseUrl());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
