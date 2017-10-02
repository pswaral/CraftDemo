/**
 * Entry class for ToDoList items
 */
public class Entry {

    /**
     * Content for each entry
     */
    private String content;

    /**
     * Status for each entry
     */
    private boolean status;

    /**
     * Constructor
     * Set current content
     * Set status to false
     * @param content - text in an entry
     */
    public Entry(String content) {
        if(content == null)
            throw new IllegalArgumentException("Null content");
        else
            this.content = content;

        this.status = false;
    }

    /**
     * Get content of current entry
     *
     * @return content - text in an entry
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Sets content of current entry
     *
     * @param content - text in an entry
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Sets status of current entry
     *
     * @param status - status of an entry
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * Gets status of current entry
     *
     * @return - status of an entry
     */
    public boolean getStatus() {
        return this.status;
    }

}