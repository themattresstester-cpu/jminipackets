package net.jminipackets.shortcuts;

import java.util.HashMap;
import java.util.Map;

public class PrintShortcuts {
    private Map<Integer, String>  idToStringLibrary = new HashMap<>();
    public void outputLog(String debugCategory, String debugOutput) {
        IO.println(debugCategory + debugOutput);
    }
    public void addIdToString (int outputID, String outputString) {
        idToStringLibrary.put(outputID, outputString);
    }
    public String requestIdToString (int outputID) {
       return idToStringLibrary.get(outputID);
    }
    public void deleteIdToString (int outputID) {
        idToStringLibrary.remove(outputID);
    }
    public void deleteIdToStringWithConfirmation (int outputID, String outputString) {
        if (outputString == idToStringLibrary.get(outputID)) {
            idToStringLibrary.remove(outputID);
        }
    }
    public void outputIdToString (int outputID) {
        IO.println(idToStringLibrary.get(outputID));
    }
    public void outputStringWithColor (String color, String text) {
        final String RESET = "\u001B[0m";
        final String BLACK = "\u001B[30m";
        final String RED = "\u001B[31m";
        final String GREEN = "\u001B[32m";
        final String YELLOW = "\u001B[33m";
        final String BLUE = "\u001B[34m";
        final String MAGENTA = "\u001B[35m";
        final String CYAN = "\u001B[36m";
        final String WHITE = "\u001B[37m";
        switch (color) {
            case "BLACK" -> IO.println(BLACK + text + RESET);
            case "RED" -> IO.println(RED + text + RESET);
            case "GREEN" -> IO.println(GREEN + text + RESET);
            case "YELLOW" -> IO.println(YELLOW + text + RESET);
            case "BLUE" -> IO.println(BLUE + text + RESET);
            case "MAGENTA" -> IO.println(MAGENTA + text + RESET);
            case "CYAN" -> IO.println(CYAN + text + RESET);
            case "WHITE" -> IO.println(WHITE + text + RESET);
            default -> IO.println(text);
        }
    }
}
