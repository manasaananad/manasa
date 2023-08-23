package com.example.demo.ebookmodel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="e book")
public class Ebookm {

		public int getEbookId() {
		return ebookId;
	}
	public void setEbookId(int ebookId) {
		this.ebookId = ebookId;
	}
	public String getBookingName() {
		return bookingName;
	}
	public void setBookingName(String bookingName) {
		this.bookingName = bookingName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getEditionNo() {
		return editionNo;
	}
	public void setEditionNo(String editionNo) {
		this.editionNo = editionNo;
	}
	public String getYearofpubc() {
		return yearofpubc;
	}
	public void setYearofpubc(String yearofpubc) {
		this.yearofpubc = yearofpubc;
	}
	public String getCoauthorname() {
		return coauthorname;
	}
	public void setCoauthorname(String coauthorname) {
		this.coauthorname = coauthorname;
	}
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int ebookId;
	    @Column(name="bookingName")
		private String bookingName;
		private String authorName;
		private String editionNo;
		private String yearofpubc;
		private String coauthorname;
		
		
	}

	
	


