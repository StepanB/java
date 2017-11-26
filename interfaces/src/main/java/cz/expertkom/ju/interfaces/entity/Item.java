package cz.expertkom.ju.interfaces.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class Item {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	/**
	 * @param id
	 */
	public Item(String id) {
		super();
		this.id = id;
	}

	public Item() {
		super();
	}
	@Column(name = "text")
	private String text;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}