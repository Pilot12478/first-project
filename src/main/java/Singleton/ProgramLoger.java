package Singleton;

public class ProgramLoger {
    private static ProgramLoger programLoger; //экземляр класса ProgramLogger
    private static String logFile ="This is log file \n\n";
    private ProgramLoger(){
        //приватный конструктор
    }

    public static ProgramLoger getProgramLoger(){
        if(programLoger==null){
            return new ProgramLoger();
        }
        return programLoger;
    }
    public void setLogInLogFile(String log){
        logFile = logFile + log +"\n";
    }
    public  void showLogInLogFile(){
        System.out.println(logFile);
    }


}
