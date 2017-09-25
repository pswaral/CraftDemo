/**
 * Base Class for a sheet
 */
public abstract class BlankSheet {

    /**
     * Blanksheet Type
     */
    public enum Type {
        Task, Note;
    }

    /**
     * ID, Title, Type of Blanksheet
     */
    private int id;
    private String title;
    private Type type;

    /**
     * Constructor
     * set title on everytime a blanksheet is created
     *
     * @param title
     */
    public BlankSheet(String title) {
        this.title = title;
    }

    /**
     * Sets title for a blank sheet
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets title of the blank sheet
     *
     * @return value of title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Sets type of the blanksheet
     *
     * @param type
     */
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * Gets type of the blank sheet
     *
     * @return value of type
     */
    public Type getType() {
        return type;
    }

    /**
     * Gets ID of the blanksheet
     *
     * @return value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets ID of a blanksheet
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }
}
