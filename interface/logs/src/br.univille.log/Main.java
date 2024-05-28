package br.univille.log;

public class Main {
    public static void main(String[] args) throws Exception {

        Logger loggerConsole = LoggerFactory.onConsole();
        loggerConsole.log(Level.DEBUG, "DEBUG");
        loggerConsole.log(Level.WARNING, "AVISO");
        loggerConsole.log(Level.ERROR, "ERRO");

        Logger loggerFile = LoggerFactory.onFile("log.txt");
        loggerFile.log(Level.DEBUG, "DEBUG");
        loggerFile.log(Level.WARNING, "AVISO");
        loggerFile.log(Level.ERROR, "ERRO");
        
    }
}
