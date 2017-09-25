import java.util.ArrayList;
import java.util.List;

/**
 * Simulated Server
 */
public class Main {
    /**
     * Client - Server interaction simulation
     * @param args
     */
    public static void main(String[] args) {

        /* Simulating get request, browswer/client is doing the get request*/
        List<BlankSheet> listofSheets = getSheets();
        System.out.println(listofSheets);

        /* Simulating adding/post request a task */
        ToDoList toDoList1 = new ToDoList("Wedding");
        List<Entry> listOfEntries = new ArrayList<>();
        Entry entry1 = new Entry("bridal dress");
        listOfEntries.add(entry1);
        toDoList1.setListOfEntries(listOfEntries);
        postSheet(toDoList1);
        listofSheets = getSheets();
        System.out.println(listofSheets);

        /* Simulating adding/post request a note */
        Note note1 = new Note("Grocerry");
        note1.setContent("get sugar");
        postSheet(note1);
        listofSheets = getSheets();
        System.out.println(listofSheets);

        /* Get a sheet */
        BlankSheet sheet1 = getSheet(1);
        System.out.println(sheet1);
        listofSheets = getSheets();
        System.out.println(listofSheets);

        /* Simulating a put for an update to a note */
        put(1, "Grocerry For the weekend", BlankSheet.Type.Note, "get milk and sugar",null);
        listofSheets = getSheets();
        System.out.println(listofSheets);

        /* Simulating a delete request */
        delete(1);
        listofSheets = getSheets();
        System.out.println(listofSheets);

    }

    /**
     * @POST
     * @Path("/sheets")
     *
     * Simulated server POST endpoint to add a new sheet(note/to-list)
     * Assumption: Request body is de-serialized to a specific sheet instance of type(task/note)
     *
     * @param sheet
     * @return
     */
    public static BlankSheet postSheet(BlankSheet sheet) {

        SheetsManager sheets = SheetsManager.getSheetsManager();
        sheets.addSheet(sheet);
        return sheet;
    }

    /**
     * @GET
     * @Path("/sheets")
     *
     * Simulated server GET endpoint to get list of all sheets
     *
     * @return list of all sheets
     */
    public static List<BlankSheet> getSheets() {
        // on the class, no need to create new object, storing the value in the same instance
        SheetsManager sheets = SheetsManager.getSheetsManager();

        return sheets.getSheets(); //wrapped around return as a json

    }

    /**
     * @GET
     * @Path("/sheets/:id")
     *
     * Simulated server GET endpoint to get one specific sheet
     *
     * @return one sheet
     */
    public static BlankSheet getSheet(int id) {

        // singleton pattern, get sheets, no need to create an instance
        SheetsManager sheets = SheetsManager.getSheetsManager();

        return sheets.getSheets().get(id);

    }

    /**
     * @DELETE
     * @Path("/sheets/:id")
     *
     * Simulated server to delete one specific sheet
     *
     * @return one sheet
     */
    public static void delete(int id) {
        SheetsManager sheets = SheetsManager.getSheetsManager();
        sheets.deleteSheet(id);
    }

    /**
     * @PUT
     * @Path("/sheets/:id")
     *
     * Simulated server PUT endpoint to get one specific sheet
     *
     * @return one sheet
     */
    public static void put(int id, String title, BlankSheet.Type type, String noteContent, List<Entry> listOfEntries) {
        SheetsManager sheets = SheetsManager.getSheetsManager();

        // find the type of sheet and set title and content
        if(type == BlankSheet.Type.Note) {
            Note note = (Note)getSheet(id);
            if(title != null) {
                note.setTitle(title);
            }

            if(noteContent != null) {
                note.setContent(noteContent);
            }
        }
        else {
            ToDoList task = (ToDoList)getSheet(id);
            if(title != null) {
                task.setTitle(title);
            }

            if(listOfEntries != null) {
                task.setListOfEntries(listOfEntries);
            }
        }
    }

    /**
     * @PUT
     * @Path("/sheets/:id/entries/:id")
     *
     * Simulated server PUT endpoint to change a particular entry within a todolist
     *
     */
     // todo: should be implemented on put on each entry
     //    public static void putEntry(int id, String title, BlankSheet.Type type, String noteContent, List<Entry> listOfEntries) {
     //    }

}
