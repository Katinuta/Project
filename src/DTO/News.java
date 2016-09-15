package DTO;

import java.util.Date;

public class News extends Entity{
	private int newsId;
	private String name;
	private String annotation;
	private String author;
	private Date date;
	private int categoryId;
	private String text;
	
	public News(){}

	public News(int newsId, String name, String annotation, String author, Date date, int categoryId, String text) {
		super();
		this.newsId = newsId;
		this.name = name;
		this.annotation = annotation;
		this.author = author;
		this.date = date;
		this.categoryId = categoryId;
		this.text = text;
	}

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAnnotation() {
		return annotation;
	}

	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	};
	
	
}
