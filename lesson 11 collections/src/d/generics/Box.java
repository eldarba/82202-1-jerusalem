package d.generics;

public class Box<T> {

	private T content;

	public Box() {
	}

	public Box(T content) {
		super();
		this.content = content;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

}
