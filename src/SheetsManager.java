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
    private Map<Integer, Sheet> dataBase;

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
     * @return cached single instance of SheetsManager
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
     * @param sheet - sheet to be added
     */
    public void addSheet(Sheet sheet) {
        Integer id = dataBase.size();
        sheet.setId(id);
        dataBase.put(id, sheet);
    }

    /**
     * Get a particular sheet
     * @param id - sheet id
     * @return Sheet - return the request sheet
     */
    public Sheet getSheet(int id) {
        return dataBase.get(id);
    }

    /**
     * Removes the current sheet from the database
     * @param id - sheet's id
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
     * @param markedSheets - checked list of sheets to be deleted
     */
    public void deleteMultipleSheets(int[] markedSheets) {
        for (int index: markedSheets) {
            dataBase.remove(index);
        }
    }

    /**
     * Gets the entire list of sheets
     * @return List<Sheet> - list of all sheets from the database
     */
    public List<Sheet> getSheets() {
        return new ArrayList<>(dataBase.values());
    }


}
