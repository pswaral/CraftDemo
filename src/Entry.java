/**
 * Entry class for ToDoList items
 */
public class Entry {

    /**
     * Content and status for each entry
     */
    private String content;
    private boolean status;

    /**
     * Constructor
     * Set current content
     * Set status to false
     * @param content
     */
    public Entry(String content) {
        this.content = content;
        this.status = false;
    }

    /**
     * Get content of current entry
     *
     * @return
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Sets content of current entry
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Sets status of current entry
     *
     * @param status
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * Gets status of current entry
     *
     * @return
     */
    public boolean getStatus() {
        return this.status;
    }

}