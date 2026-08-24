package HomeWorkPatterns.Singleton;

public class Logger {
    private static Logger logger;
    private String logFile;

    private Logger(){
        logFile = "this is logFile \n";
    }

    public static Logger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void info(String log){
       logFile = logFile + log +"\n";
    }

    public String getLogFile() {
        return logFile;
    }

    public void warning(String log){
        logFile = logFile + log +"\n";
    }
    public void error(String log){
        logFile = logFile + log +"\n";
    }
}
