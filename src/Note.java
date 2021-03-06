/**
 * Child class Note of Sheet
 */
public class Note extends Sheet {

    /**
     * Note's content
     */
    private String content;

    /**
     * Constructor for Note
     * Over ridden constructor from parent class to set title
     * Set type of Sheet to Note
     * Set content to empty string
     *
     * @param title
     */
    public Note(String title) {
        super(title);
        this.setType(Type.Note);
        this.content = "";
    }

    /**
     * Gets content for the note
     *
     * @return value of content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Sets content of note
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }
}
