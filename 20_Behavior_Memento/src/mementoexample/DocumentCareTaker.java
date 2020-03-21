package mementoexample;

import java.util.ArrayList;
import java.util.List;

public class DocumentCareTaker {

	private List<DocumentMemento> mementoList = new ArrayList<DocumentMemento>();

	public void add(DocumentMemento state) {
		mementoList.add(state);
	}

	public DocumentMemento get(int index) {
		return mementoList.get(index);
	}
}
