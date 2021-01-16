package Generics;

public class Generic<T> {
	T data;
	public Generic(T obj) {
		this.data = obj;
	}
	
	public T getData() {
		return this.data;
	}

}
