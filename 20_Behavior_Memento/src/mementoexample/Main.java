package mementoexample;

public class Main {

	public static void main(String[] args) {
		
		DocumentCareTaker documentCareTaker = new DocumentCareTaker();
		
		Document document = new Document();
		document.setId(1);
		document.setTitle("Document 1 Title");
		document.setContent("Document 1 Content");
		
		System.out.println("Document Information");
		System.out.println("Document Id : " + document.getId() );
		System.out.println("Document Title : " + document.getTitle() );
		System.out.println("Document Content : " + document.getContent() );
		System.out.println("-------------------------------------------");
		
		DocumentMemento documentMemento = document.save();
		documentCareTaker.add(documentMemento);
		
		document.setTitle("Document 1 Title and Title");
		document.setContent("Document 1 Content and Content");
		
		System.out.println("Document Update Information");
		System.out.println("Document Id : " + document.getId() );
		System.out.println("Document Title : " + document.getTitle() );
		System.out.println("Document Content : " + document.getContent() );
		System.out.println("-------------------------------------------");
		
		DocumentMemento documentMementoUndo = documentCareTaker.get(0);
		
		document.undoToLastSave(documentMementoUndo);
		
		System.out.println("Document Undo Information");
		System.out.println("Document Id : " + document.getId() );
		System.out.println("Document Title : " + document.getTitle() );
		System.out.println("Document Content : " + document.getContent() );
	}
}
