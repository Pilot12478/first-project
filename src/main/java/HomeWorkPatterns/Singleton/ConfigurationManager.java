package HomeWorkPatterns.Singleton;

public class ConfigurationManager {
    private String dataBaseUrl;
    private String userName;
    private String userPassword;
    private String filePath;
    private String logLevel;
    private String logFilePath;

    private static ConfigurationManager configurationManager;

    private ConfigurationManager() {
        dataBaseUrl = "defaultDBurl";
        userName = "defaultUsername";
        userPassword = "defaultPassword";
        filePath = "defaultPassword";
        logLevel = "defaultLogLevel";
        logFilePath = "defaultLogFilePath";

    }

    public static ConfigurationManager getConfigurationManager() {
        if (configurationManager == null) {
            configurationManager = new ConfigurationManager();
        }
        return configurationManager;
    }

    public void setConfiguration(String dataBaseUrl,
                                 String userName,
                                 String userPassword,
                                 String filePath,
                                 String logLevel,
                                 String logFilePath) {
        this.userName = userName;
        this.dataBaseUrl = dataBaseUrl;
        this.userPassword = userPassword;
        this.filePath = filePath;
        this.logLevel = logLevel;
        this.logFilePath = logFilePath;

    }

    public String getDataBaseUrl() {
        return dataBaseUrl;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public String getLogFilePath() {
        return logFilePath;
    }
}
