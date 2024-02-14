package hello.servlet.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello") //이름은 아무거나 해도 된다.
public class HelloServlet extends HttpServlet {

    //HelloServlet 호출하면 service 메서드를 자동으로 실행한다.
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("HelloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        String username = request.getParameter("username");
        System.out.println("username = " + username);

        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8"); //위에 것과 함께 헤더에서 확인할 수 있음
        response.getWriter().write("hello " + username); //write는 메세지 바디에 데이터가 들어가게 함

    }
}
