package com.yutu.util;

import java.util.List;
import java.util.Map;

/**
 * 表头工具类
 * @author Administrator
 *
 */
public class TemplateData {

	private List<Map<String, String>> data;
	
	private int pageSize;
	
	private int total;

	public List<Map<String, String>> getData() {
		return data;
	}

	public void setData(List<Map<String, String>> data) {
		this.data = data;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
}
