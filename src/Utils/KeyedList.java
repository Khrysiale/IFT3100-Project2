package Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
* Classe qui implemente une collection addressable par identifiant (id) de type parametrable.
* Cree pour eviter des bugs de synchronisation entre map et list lors de l'insertion/suppression.
* @param <K> : Type de l'identifiant unique des objets.
* @param <T> : Type d'object de la collection.
*/

public class KeyedList<K, T> {
	private Map<K,T> map;
	private List<T> list;


    public KeyedList() {
        map = new HashMap<K,T>();
        list = new ArrayList<T>();
    }

    public int size() {
    	return list.size();
    }
    
    public void clear() {
    	map.clear();
    	list.clear();
    }
    
    public void add(K id, T obj) {
    	map.put(id,obj);
    	list.add(obj);
    }

    public T getByIndex(int index) {
        return list.get(index);
    }

    public T getById(K id) {
        return map.get(id);
    }

    public void remove(T obj) {
        map.remove(obj);
        list.remove(obj);
    }

    public void removeByIndex(int index) {
    	this.remove(list.get(index));
    }

    public void removeById(K id) {
    	this.remove(map.get(id));
    }

	public Iterator<T> iterator() {
		return list.iterator();
	}

}
