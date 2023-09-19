package com.tjoeun.bookshop;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class BookVOEx
{
//	1. 필드
	private String title = ""; // 도서명
	private String author = ""; // 저자
	private String publisher = "";//출판사
	private Date writeDate = new Date();//출판일
	private double price = 0.0;//가격
	
//	2. 생성자
	public BookVOEx()
	{
		// TODO Auto-generated constructor stub
	}

public BookVOEx(String title, String author, String publisher, Date writeDate, double price)
{
	super();
	this.title = title;
	this.author = author;
	this.publisher = publisher;
	writeDate.setYear(writeDate.getYear()-1900);
	writeDate.setMonth(writeDate.getMonth()-1);
	this.writeDate = writeDate;
	this.price = price;
}
//	3. getters & setters

public String getTitle()
{
	return title;
}

public void setTitle(String title)
{
	this.title = title;
}

public String getAuthor()
{
	return author;
}

public void setAuthor(String author)
{
	this.author = author;
}

public String getPublisher()
{
	return publisher;
}

public void setPublisher(String publisher)
{
	this.publisher = publisher;
}

public Date getWriteDate()
{
	return writeDate;
}

public void setWriteDate(Date writeDate)
{
	this.writeDate = writeDate;
}

public double getPrice()
{
	return price;
}

public void setPrice(double price)
{
	this.price = price;
}
//	4. toString()

@Override
public String toString()
{
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
	DecimalFormat df = new DecimalFormat("#,##0원");
	return String.format("%s %s %s %s %s",title,author,publisher,sdf.format(writeDate), df.format(price));
}
//	5. hashCode, equals

@Override
public int hashCode()
{
	return Objects.hash(author, price, publisher, title, writeDate);
}

@Override
public boolean equals(Object obj)
{
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	BookVOEx other = (BookVOEx) obj;
	return Objects.equals(author, other.author)
			&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
			&& Objects.equals(publisher, other.publisher) && Objects.equals(title, other.title)
			&& Objects.equals(writeDate, other.writeDate);
}

	
}
