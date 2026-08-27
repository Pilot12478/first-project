package HomeWorkPatterns.Singleton;

public class Main {
    static void main() {
        ConfigurationManager configurationManager = ConfigurationManager.getInstance();
        System.out.println(configurationManager.getDataBaseUrl());   // вернулся дефолтный URL
        configurationManager.setConfiguration("someUrl","someName","somePass","somePath","someLogLevel","someLogFilePath");
        System.out.println(configurationManager.getDataBaseUrl());   // вернулся новый URL

        Logger logger = Logger.getLogger();
        logger.info("Успешное подключение к БД");
        logger.warning("Попытка воспользоваться устаревшей функцией");
        logger.error("Какая-то ошибка при работе с БД");
        System.out.println(logger.getLogFile());
    }
}
