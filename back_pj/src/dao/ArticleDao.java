package dao;

import java.util.List;
import dto.Article;

public interface ArticleDao {
	public void writeArticle(Article article);
	public List<Article> getArticleList();
	public Article getArticle(int articleId);
	
	public void updateBoard(Article article);
	public void deleteBoard(int articleId);
}
