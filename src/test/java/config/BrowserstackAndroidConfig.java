package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:credentials.properties"})
public interface BrowserstackAndroidConfig extends Config {

    @Key("Login")
    String login();

    @Key("Password")
    String password();

    @Key("BaseURL")
    String baseUrl();

    @Key("AppURL")
    String appUrl();

    @Key("Device")
    String device();

    @Key("OS_Version")
    String osVersion();

    @Key("Project")
    String projectName();

    @Key("Build")
    String buildName();

    @Key("Name")
    String testName();
}
