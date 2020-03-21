package mementoexample;

public class DocumentMemento {

	private long id;
    private String title;
    private String content;
	public DocumentMemento() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DocumentMemento(long id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
    
    
}
