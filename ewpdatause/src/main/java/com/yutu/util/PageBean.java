package com.yutu.util;

import java.util.List;

public class PageBean<T> {
	private int total;
	private int size;
	private int page;
	private List<T> list;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
	
	
	@Override
	public String toString() {
		return "PageBean [total=" + total + ", list=" + list + "]";
	}
	
	
	

}
