package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MainDaoImpl;
import dto.Video;

@WebServlet("/main")
public class MainController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		
		switch (action) {
		case "list":
			System.out.println("list도착");
			doList(request, response);
			break;
		case "detail":
			System.out.println("detail 도착");
			doDetail(request, response);
			break;
		case "update":
			break;
		}
		
	}

	

	private void doDetail(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("detail 시작");
		String youtubeId = request.getParameter("youtubeId");
		Video video = MainDaoImpl.getInstance().getVideo(youtubeId);
		HttpSession session = request.getSession();
		session.setAttribute("detailVideo", video);
		response.sendRedirect("detail.jsp");
	}

	private void doList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//파트 선택되어있는지 확인
		String part = request.getParameter("part");
		
		if(part!=null) {
			System.out.println("part 도착" + " " + part);
			List<Video> partList;
			HttpSession session;
			
			switch (part) {
			case "전신":
				System.out.println("전신");
				partList = MainDaoImpl.getInstance().selectPartFitVideo("전신");
				System.out.println(partList);
				session = request.getSession();
				session.setAttribute("partList", partList);
				break;
			case "상체":
				System.out.println("상체");
				partList = MainDaoImpl.getInstance().selectPartFitVideo("상체");
				session = request.getSession();
				session.setAttribute("partList", partList);
				break;
			case "하체":
				System.out.println("하체");
				partList = MainDaoImpl.getInstance().selectPartFitVideo("하체");
				session = request.getSession();
				session.setAttribute("partList", partList);
				break;
			case "복부":
				partList = MainDaoImpl.getInstance().selectPartFitVideo("복부");
				session = request.getSession();
				session.setAttribute("partList", partList);
				break;
			}
		}
		
		//전체리스트 출력
		List<Video> videoList = MainDaoImpl.getInstance().getList();
		
		request.setAttribute("videoList", videoList);

		HttpSession session = request.getSession();
		session.setAttribute("videoList", videoList);
		response.sendRedirect("list.jsp");
//		request.getRequestDispatcher("list.jsp").forward(request, response);
		
	}

}
