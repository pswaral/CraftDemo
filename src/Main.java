import java.util.ArrayList;
import java.util.List;

/**
 * Simulated Server
 */
public class Main {

    public static void main(String[] args) {

        /* Simulating get request, browswer/client is doing the get request*/
        List<Sheet> listofSheets = getSheets();
        System.out.println(listofSheets);

        /* Simulating adding/post request a todolist */
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
        Sheet sheet1 = getSheet(1);
        System.out.println(sheet1);
        listofSheets = getSheets();
        System.out.println(listofSheets);

        /* Simulating a put for an update to a note */
        put(1, "Grocerry For the weekend", Sheet.Type.Note, "get milk and sugar",null);
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
     * Simulated server POST endpoint to add a new sheet(note/toDoList)
     * Assumption: Request body is de-serialized to a specific sheet instance of type(todoList/note)
     *
     * @param sheet
     * @return List<Sheet>
     */
    public static List<Sheet> postSheet(Sheet sheet) {
        SheetsManager sheets = SheetsManager.getSheetsManager();
        sheets.addSheet(sheet); //DB updates id
        return sheets.getSheets();

        /* If we had a request and response objects */
        //Sheet sheet = JsonDeserializer.deSerialize(request.body);
        //SheetsManager sheets = SheetsManager.getSheetsManager();
        //sheets.addSheet(sheet); //DB updates id
        //Json sheetsJsonResponse = JsonSerializer.serialize(sheets);
        //return response.send(sheetsJsonResponse);
    }

    /**
     * @GET
     * @Path("/sheets")
     *
     * Simulated server GET endpoint to get list of all sheets
     *
     * @return list of all sheets
     */
    public static List<Sheet> getSheets() {
        // on the class, no need to create new object, storing the value in the same instance
        SheetsManager sheets = SheetsManager.getSheetsManager();
        return sheets.getSheets(); //wrapped around return as a json

        /* If we had a request and response objects */
        //SheetsManager sheets = SheetsManager.getSheetsManager();
        //List<Sheet> sheets = sheets.getSheets();
        //Json sheetsJsonResponse = JsonSerializer.serialize(sheets);
        //return response.send(sheetsJsonResponse);

    }

    /**
     * @GET
     * @Path("/sheets/:id")
     *
     * Simulated server GET endpoint to get one specific sheet
     *
     * @return one sheet
     */
    public static Sheet getSheet(int id) {

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
    public static void put(int id, String title, Sheet.Type type, String noteContent, List<Entry> listOfEntries) {
        SheetsManager sheets = SheetsManager.getSheetsManager();

        // find the type of sheet and set title and content
        if(type == Sheet.Type.Note) {
            Note note = (Note)sheets.getSheet(id);
            if(title != null) {
                note.setTitle(title);
            }

            if(noteContent != null) {
                note.setContent(noteContent);
            }
        }
        else {
            ToDoList toDoList = (ToDoList)sheets.getSheet(id);
            if(title != null) {
                toDoList.setTitle(title);
            }

            if(listOfEntries != null) {
                toDoList.setListOfEntries(listOfEntries);
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
    public static void put(int sheetId, int entryId, List<Entry> listOfEntries, Boolean status, String content) {
        SheetsManager sheets = SheetsManager.getSheetsManager();

        ToDoList toDoList = (ToDoList)sheets.getSheet(sheetId);
        Entry entry = listOfEntries.get(entryId);

        if(content != null) {
            entry.setContent(content);
        }
        if(status != null) {
            entry.setStatus(status);
        }

    }

}
