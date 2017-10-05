/**
 *

public class ToDoListTest {

        @Test()
        public void testToDoListSizeIsZero() {

                ToDoList toDoList = new ToDoList("Wedding");
                toDoList.addNewEntry("photography");
                toDoList.deleteEntry(0);
                Assert.assertEquals(toDoList.getListOfEntries().size(), 0);
        }

        @Test()
        public void testToDoListIsDeleted() {

                ToDoList toDoList = new ToDoList("Weekend plans");
                toDoList.addNewEntry("go out");
                toDoList.addNewEntry("call friends over");
                toDoList.deleteListOfEntries();
                Assert.assertEquals(toDoList.getListOfEntries().size(), 0);
        }

        @Test
        public void testToUpdateToDoList() {

                ToDoList toDoList = new ToDoList("Grocerry");
                toDoList.addNewEntry("milk");
                toDoList.addNewEntry("water");
                toDoList.addNewEntry("vegetables");
                toDoList.updateEntry(1, true);
                List<Entry> entries = toDoList.getListOfEntries();
                Assert.assertEquals(entries.get(0).getContent(), "milk");
                Assert.assertEquals(entries.get(0).getTitle(), "Grocerry");
                Assert.assertEquals(entries.get(0).getStatus(), true);
                Assert.assertEquals(entries.get(1).getStatus(), false);
                Assert.equalsEquals(toDoList.getType(), Sheet.Type.ToDoList));
                Assert.assertEquals(toDoList.getListOfEntries().size(), 2);
        }
}
 */