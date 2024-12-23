package com.prowings.jdbc.practice;

import java.sql.Date;
//import java.time.LocalDate;

public class books {

	private int book_id;
	private String title;
	private String author;
	private String publisher;
	private Date published_date;
	private int price;

	public books() {
		super();
	}

	public books(int book_id, String title, String author, String publisher, Date published_date, int price) {
		super();
		this.book_id = book_id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.published_date = published_date;
		this.price = price;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getPublished_date() {
		return published_date;
	}

	public void setPublished_date(Date published_date) {
		this.published_date = published_date;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = (int) price;
	}

	@Override
	public String toString() {
		return "books [book_id=" + book_id + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", published_date=" + published_date + ", price=" + price + "]";
	}

}
