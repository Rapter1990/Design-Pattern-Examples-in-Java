### Behavior Design Pattern - Memento

![Image description](https://github.com/Rapter1990/Design-Pattern-Examples-in-Java/blob/master/images/memento.png)

<hr>
<h2>Figure Information</h2>

<table>
  <tr>
    <th>Use Case Name</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>Originator</td>
    <td>Create a memento with its state</td>
  </tr>
  <tr>
    <td>Memento</td>
    <td>Store state of originator</td>
  </tr>
  <tr>
    <td>CareTaker</td>
    <td>Control memento storing its state</td>
  </tr>
  
</table>

<hr>
Description:
This design pattern is used to take a snapshot of object's state in terms of its particular state

For example :

```
public class Document {

        ....

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

public class DocumentCareTaker {
	private List<DocumentMemento> mementoList = new ArrayList<DocumentMemento>();
	
}	

public class DocumentMemento {

}

```
