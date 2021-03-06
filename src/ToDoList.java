import java.util.*;

/**
 * Child class ToDoList of Sheet
 */
public class ToDoList extends Sheet {

    /**
     * List of entries
     */
    private List<Entry> listOfEntries;

    /**
     * Constructor
     * Overidden constructor from parent class to set title
     * Set type of Sheet to ToDoList
     * Set list of entries to an empty arraylist
     *
     * @param title
     */
    public ToDoList(String title) {
        super(title);
        this.setType(Type.ToDoList);
        this.listOfEntries = new ArrayList<>();
    }

    /**
     * Add a new entry with content to the todolist
     * @param content
     */
    public void addNewEntry(String content) {
        if(content != null)
            listOfEntries.add(new Entry(content));
        else
            throw new IllegalArgumentException("null content");
    }

    /**
     * Remove an entry from the todolist
     * @param index
     */
    public void deleteEntry(int index) {
        if(index < listOfEntries.size())
            listOfEntries.remove(index);
        else
            throw new IndexOutOfBoundsException("index is invalid");
    }

    /**
     * change content of any todolist item
     * overloaded function
     * @param index
     * @param content
     */
    public void updateEntry(int index, String content) {
        if(index < listOfEntries.size() && content != null) {
            Entry currentEntry = listOfEntries.get(index);
            currentEntry.setContent(content);
        }
        else {
            throw new IllegalArgumentException("Content is null or index of out bound");
        }
    }

    /**
     * change the status on any todolist item
     * overloaded function
     * @param index
     * @param status
     */
    public void updateEntry(int index, boolean status) {
        if(index < listOfEntries.size()) {
            Entry currentEntry = listOfEntries.get(index);
            currentEntry.setStatus(status);
        }
    }

    /**
     * change content and status of an entry
     * @param index
     * @param content
     * @param status
     */
    public void updateEntry(int index, String content, boolean status) {
        if(index < listOfEntries.size() && content != null) {
            Entry currentEntry = listOfEntries.get(index);
            currentEntry.setContent(content);
            currentEntry.setStatus(status);
        }
        else {
            throw new IllegalArgumentException("Content is null or index of out bound");
        }
    }

    /**
     * Get list of todolist items
     *
     * @return value of listofEntries
     */
    public List<Entry> getListOfEntries() {
        return this.listOfEntries;
    }

    /**
     * Set list of entries on a todolist
     *
     * @param listOfEntries
     */
    public void setListOfEntries(List<Entry> listOfEntries) {
        this.listOfEntries = listOfEntries;
    }

    /**
     * removes entire list of todolist items
     */
    public void deleteListOfEntries() {
        listOfEntries.clear();
    }

}

