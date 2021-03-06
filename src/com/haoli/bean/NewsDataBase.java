package com.haoli.bean;

/**
 * 新闻数据基类
 * 
 * @author guoxiao
 */

public class NewsDataBase {

	/*********标题、时间、摘要****/
	private String newsTitle;
	private String newsTime;
	private String newsSummary;
	private String newsID;
	
	
	public String getNewsID() {
		return newsID;
	}
	public void setNewsID(String newsID) {
		this.newsID = newsID;
	}
	
	public String getNewsTitle() {
		return newsTitle;
	}
	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}
	
	public String getNewsTime() {
		return newsTime;
	}
	public void setNewsTime(String newsTime) {
		this.newsTime = newsTime;
	}
	public String getNewsSummary() {
		return newsSummary;
	}
	public void setNewsSummary(String newsSummary) {
		this.newsSummary = newsSummary;
	}
	
}
