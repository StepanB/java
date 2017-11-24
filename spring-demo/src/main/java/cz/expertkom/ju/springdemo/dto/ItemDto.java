package cz.expertkom.ju.springdemo.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ItemDto {

	private String text;
	
	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

}
