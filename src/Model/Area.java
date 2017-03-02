package Model;

import Utils.KeyedList;

public class Area {
	
	private int idCounter;
	private KeyedList<Integer,CollectionElement> keyedElem;
	
	public Area(){
		super();
		idCounter = 0;
		keyedElem = new KeyedList<Integer,CollectionElement>();
	}

	public KeyedList<Integer, CollectionElement> getKeyedElem() {
		return keyedElem;
	}

	public void setKeyedElem(KeyedList<Integer, CollectionElement> keyedElem) {
		this.keyedElem = keyedElem;
	}
	
	public CollectionElement getElementById(int id){
		return keyedElem.getById(id);
	}
	
	public int getNextId() {
		return idCounter++;
	}
	

}
