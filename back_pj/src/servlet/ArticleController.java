package servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dao.ArticleDao;
import dao.ArticleDaoImpl;
import dto.Article;
import dto.Video;

@WebServlet("/article")
public class ArticleController extends HttpServlet{
	
	private ArticleDao dao = ArticleDaoImpl.getInstance();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		process(request, response);
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		switch(action) {
		
		case "detail":
			doDetail(request, response);
			break;
		case "list":
			doList(request, response);
			break;	
		}
		
	}


	private void doDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
//		int articleId = Integer.parseInt(request.getParameter("articleId"));
//		Article article = ArticleDaoImpl.getInstance().getArticle(articleId);
//		Video video = 
		request.setAttribute("detailVideo", video);
		request.getRequestDispatcher("article/detail.jsp").forward(request, response);
		
	}


	private void doList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Article> articles = ArticleDaoImpl.getInstance().getArticleList();
		request.setAttribute("articles", articles);
		
		request.getRequestDispatcher("article/list.jsp").forward(request, response);
	}


	private void doWrite(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String userName = request.getParameter("userName");
		
		HttpSession session = request.getSession();
		
		Article article = new Article(0, title, content, userName, 0, null);
		ArticleDaoImpl.getInstance().writeArticle(article);
		
		response.sendRedirect("article?action=list");
	}
}