package p13.textbook.s130701;

public class StorageImpl<T> implements Storage<T> {
	private T[] array;
	
	// 타입 파라미터로 배열을 생성하려면 new T[n] 형태로 생성할 수 없고
	// (T[]) (new Object[n])으로 생성해야 한다. 
	public StorageImpl(int capacity) {
		this.array = (T[]) (new Object[capacity]);
	}
	
	@Override
	public void add(T item, int index) {
		array[index] = item;
	}
	
	@Override
	public T get(int index) {
		return array[index];
	}
	
	
}
