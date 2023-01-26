package com.gyojincompany.exer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.naver")//모든 url창에 찍히는 요청에서 .naver로 끝나는 요청을 전부 잡아옴!
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doAction(request, response);
		
//		String uri = request.getRequestURI();
//		
//		System.out.println("가져온 uri : "+uri);
//		
//		String conPath = request.getContextPath();//컨택스트 패스만 분리하여 저장
//		
//		System.out.println("Context Path : "+conPath);
//		
//		String command = uri.substring(conPath.length());
//		
//		System.out.println("command : "+command);
//		
//		if(command.equals("/BlogHome.naver")) {
//			System.out.println("BlogHome 명령이 들어왔습니다.");
//			request.setAttribute("id", "tiger");
//			//response.sendRedirect("blog.jsp");
//			RequestDispatcher dispatcher = request.getRequestDispatcher("/blog.jsp");
//			dispatcher.forward(request, response);
//			
//		} else if(command.equals("/Hello.naver")) {
//			System.out.println("Hello 명령이 들어왔습니다.");
//			//response.sendRedirect("hello.jsp");
//			RequestDispatcher dispatcher = request.getRequestDispatcher("/hello.jsp");
//			dispatcher.forward(request, response);
//		} else if(command.equals("/Login.naver")) {
//			
//			String mid = request.getParameter("id");
//			String mpw = request.getParameter("pw");
//			
//			System.out.println("Login 명령이 들어왔습니다.");
//			System.out.println("id : " + mid);
//			System.out.println("pw : " + mpw);
//			
//			RequestDispatcher dispatcher = request.getRequestDispatcher("/loginOk.jsp");
//			dispatcher.forward(request, response);
//		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doAction(request, response);
	}
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uri = request.getRequestURI();
		
		System.out.println("가져온 uri : "+uri);
		
		String conPath = request.getContextPath();//컨택스트 패스만 분리하여 저장
		
		System.out.println("Context Path : "+conPath);
		
		String command = uri.substring(conPath.length());
		
		System.out.println("command : "+command);
		
		if(command.equals("/BlogHome.naver")) {
			System.out.println("BlogHome 명령이 들어왔습니다.");
			request.setAttribute("id", "tiger");
			//response.sendRedirect("blog.jsp");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/blog.jsp");
			dispatcher.forward(request, response);
			
		} else if(command.equals("/Hello.naver")) {
			System.out.println("Hello 명령이 들어왔습니다.");
			//response.sendRedirect("hello.jsp");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/hello.jsp");
			dispatcher.forward(request, response);
		} else if(command.equals("/Login.naver")) {
			
			String mid = request.getParameter("id");
			String mpw = request.getParameter("pw");
			
			System.out.println("Login 명령이 들어왔습니다.");
			System.out.println("id : " + mid);
			System.out.println("pw : " + mpw);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/loginOk.jsp");
			dispatcher.forward(request, response);
		}
	}

}
