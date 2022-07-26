package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:credentials.properties"})
public interface MobileLocalConfig extends Config {

    @DefaultValue("Pixel 4 API 30")
    String DeviceLocalName();

    @Key("osLocalVersion")
    @DefaultValue("11.0")
    String OsVersion();

    @Key("baseLocalUrl")
    @DefaultValue("http://localhost:4723/wd/hub")
    String BaseLocalUrl();

    @DefaultValue("Android")
    String PlatformName();
}
