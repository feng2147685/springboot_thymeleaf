package com.yutu.util;

import java.util.List;

public class Paging<T> {
	private int page;
	private int size;
	private int count;
	private List<T> data ;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public Paging() {
		super();
	}
	public Paging(int page, int size, int count, List<T> data) {
		super();
		this.page = page;
		this.size = size;
		this.count = count;
		this.data = data;
	}
	
}
