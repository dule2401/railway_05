package Testing8.vti.entity.exe3;

public class Phone<K, V> {
	private K key;
	private V value;

	public Phone(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Phone [key=" + key + ", value=" + value + "]";
	}

}
