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

		for (int i = 0; i < articles.size(); i++) {
			if (articles.get(i).getArticleId() == articleId) {
				return articles.get(i);
			}
		}
		return null;
	}

	@Override
	public void updateBoard(Article article) {
		// 리스트에서 찾아서 꺼내고 바꾸고
		for (int i = 0; i < articles.size(); i++) {
			if (articles.get(i).getArticleId() == article.getArticleId()) {
				articles.get(i).setTitle(article.getTitle());
				articles.get(i).setContent(article.getContent());
			}
		}
	}

	@Override
	public void deleteBoard(int articleId) {
		// 리스트에서 찾아서 꺼내고 끝
		for (int i = 0; i < articles.size(); i++) {
			if (articles.get(i).getArticleId() == articleId) {
				articles.remove(i);
			}
		}
	}
}
