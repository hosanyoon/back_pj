package dto;

import java.util.Date;

public class Article {
	private int articleId;
	private String title;
	private String content;
	private String userName;
	private int viewCnt;
	private Date regDate;
	
	public Article() {
		super();
	}

	public Article(int articleId, String title, String content, String userName, int viewCnt, Date regDate) {
		super();
		this.articleId = articleId;
		this.title = title;
		this.content = content;
		this.userName = userName;
		this.viewCnt = 0;
		this.regDate = new Date();
	}

	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", title=" + title + ", content=" + content + ", userName="
				+ userName + ", viewCnt=" + viewCnt + ", regDate=" + regDate + "]";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	public int getArticleId() {
		return articleId;
	}


	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}



	public int getViewCnt() {
		return viewCnt;
	}


	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}


	public Date getRegDate() {
		return regDate;
	}


	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
	
	
}
