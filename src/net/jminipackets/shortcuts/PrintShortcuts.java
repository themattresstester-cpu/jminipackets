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
}
