package org.cs.project.page;

import org.cs.project.area.SearchArea;
import org.cs.project.pages.Pages;
import org.cs.project.*;


public class BaiduIndex extends Pages{
	
	private SearchArea searchArea;
	
	
	
	public BaiduIndex(String URL) {
		super(URL);
		// TODO Auto-generated constructor stub
	}
	


	public String URL = null;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaiduIndex baiduIndex = new BaiduIndex("http://www.baidu.com");
		baiduIndex.searchArea.
		

	}


	public SearchArea getSearchArea() {
		return searchArea;
	}


	public void setSearchArea(SearchArea searchArea) {
		this.searchArea = searchArea;
	}

}
