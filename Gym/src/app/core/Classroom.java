package app.core;

public class Classroom {

	private int id;
	private Type type;
	private Trainer trainer;
	private Member[] members = new Member[10];

	public Classroom(int id, Type type, Trainer trainer) {
		super();
		this.id = id;
		this.type = type;
		this.trainer = trainer;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public Member[] getMembers() {
		return members;
	}

	public void setMembers(Member[] members) {
		this.members = members;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Classroom [id=" + id + ", type=" + type + "]";
	}

}
