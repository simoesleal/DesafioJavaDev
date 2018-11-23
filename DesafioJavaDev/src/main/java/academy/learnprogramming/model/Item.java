package academy.learnprogramming.model;

import java.time.LocalDate;

public class Item {
	
	// == fields ==
	private int id;
	private String title;
	private String details;
	private LocalDate deadLine;
	
	public Item() {}
	
	public Item(int id, String title, String details, LocalDate deadLine) {
		this.id = id;
		this.title = title;
		this.details = details;
		this.deadLine = deadLine;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public LocalDate getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(LocalDate deadLine) {
		this.deadLine = deadLine;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TodoItem [id=" + id + ", title=" + title + ", details=" + details + ", deadLine=" + deadLine + "]";
	}
	
	
	
	

}
