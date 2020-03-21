package mementoexample;

public class Document {

	private long id;
    private String title;
    private String content;
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Document(long id, String title, String content) {
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
    
	
	// Memento
	public DocumentMemento save(){
		return new DocumentMemento(this.id, this.title, this.content);
	}
	
	public void undoToLastSave(Object obj){
		DocumentMemento memento = (DocumentMemento) obj;
		this.id = memento.getId();
		this.title = memento.getTitle();
		this.content = memento.getContent();
	}
	
}
