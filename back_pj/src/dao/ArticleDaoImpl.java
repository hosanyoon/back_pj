package dao;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;

import dto.Article;

@WebServlet("")
public class ArticleDaoImpl implements ArticleDao {
private static ArticleDaoImpl instance = new ArticleDaoImpl();
	
	private List<Article> articles;
	private int articleId;
	
	private ArticleDaoImpl() {
		articles = new ArrayList<Article>();
	}
	
	public static ArticleDaoImpl getInstance() {
		return instance;
	}
	
	@Override
	public void writeArticle(Article article) {
		article.setArticleId(++articleId);
		articles.add(article);
	}

	@Override
	public List<Article> getArticleList() {
		return articles;
	}

	@Override
	public Article getArticle(int articleId) {
		
		for(int i=0; i<articles.size();i++) {
			if(articles.get(i).getArticleId()==articleId) {
				return articles.get(i);
			}
		}
		return null;
	}
}
