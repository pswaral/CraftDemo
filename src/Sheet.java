/**
 * Base Class for a sheet
 */
public abstract class Sheet {

    /**
     * Sheet Type
     */
    public enum Type {
        ToDoList, Note;
    }

    /**
     * ID, Title, Type of sheet
     */
    private int id;
    private String title;
    private Type type;

    /**
     * Constructor
     * set title on everytime a sheet is created
     *
     * @param title
     */
    public Sheet(String title) {
        if(title == null)
            throw new IllegalArgumentException("Null content");
        else
            this.title = title;
    }

    /**
     * Sets title for a sheet
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets title of the sheet
     *
     * @return value of title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Sets type of the sheet
     *
     * @param type
     */
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * Gets type of the sheet
     *
     * @return value of type
     */
    public Type getType() {
        return type;
    }

    /**
     * Gets ID of the sheet
     *
     * @return value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets ID of a sheet
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }
}
