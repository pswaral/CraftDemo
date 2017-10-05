import java.util.ArrayList;
import java.util.List;

/**
 * Test class

public class Test {

    public static void main(String[] args) {

        SheetsManager sheets = SheetsManager.getSheetsManager();

        ToDoList toDoList1 = new ToDoList("Wedding");
        toDoList1.addNewEntry("photography");
        toDoList1.deleteEntry(0);
        //postSheet(toDoList1);
        //Sheet sheet = getSheet(0);
        //Assert.assertEquals(sheet.listOfEntries.size(), 0);

        sheets.addSheet(toDoList1);
        //Assert.equals(sheets.getSheets().size(), 1);

        ToDoList toDoList2 = new ToDoList("Grocerry");
        toDoList2.addNewEntry("milk");
        toDoList2.addNewEntry("water");
        toDoList2.addNewEntry("vegetables");
        toDoList2.updateEntry(1, true);
        List<Entry> entries = toDoList2.getListOfEntries();
        //Assert.assertEquals(entries.get(0).getContent(), "milk");
        //Assert.assertEquals(entries.get(0).getTitle(), "Grocerry");
        //Assert.assertEquals(entries.get(0).getStatus(), true);
        //Assert.equalsEquals(toDoList1.getType(), ToDoList));

        sheets.addSheet(toDoList2);
        //Assert.equals(sheets.getSheets().size(), 2);

        Note note = new Note("tips");
        note.setContent("do something");
        //postSheet(note);
        //Sheet sheet = getSheet(2);
        //Assert.equals(sheet.content, "do something new");

    }
}

 */