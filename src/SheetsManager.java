import java.util.*;

/**
 * Singleton class to access list of sheets
 */
public class SheetsManager {

    /**
     * Singleton pattern using static one instance
     */
    private static SheetsManager sheetsManager;
    /**
     * Simulated database in memory
     */
    private Map<Integer, BlankSheet> dataBase;

    /**
     * Constructor
     * Creates an empty database hashmap
     */
    public SheetsManager() {
        dataBase = new HashMap<>();
    }

    /**
     * Gets current instance of SheetsManager
     * create an instance if not existing
     * @return
     */
    public static SheetsManager getSheetsManager() {
       if(sheetsManager == null ) {
           sheetsManager = new SheetsManager();
       }
       return sheetsManager;
    }

    /**
     * Adds a new sheet and sets its id
     * and adds it in the database
     * @param sheet
     */
    public void addSheet(BlankSheet sheet) {
        Integer id = dataBase.size();
        sheet.setId(id);
        dataBase.put(id, sheet);
    }

    /**
     * Removes the current sheet from the database
     * @param id
     */
    public void deleteSheet(int id) {
        dataBase.remove(id);
    }

    /**
     * Deletes all the sheets from the database
     */
    public void deleteAllSheets() {
        dataBase.clear();
    }

    /**
     * Deletes selected multiple sheets
     * @param markedSheets
     */
    public void deleteMultipleSheets(int[] markedSheets) {
        for (int index: markedSheets) {
            dataBase.remove(index);
        }
    }

    /**
     * Gets the entire list of sheets
     * @return
     */
    public List<BlankSheet> getSheets() {
        return new ArrayList<>(dataBase.values());
    }


}
