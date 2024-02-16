package hello.servlet.web.springmvc.old;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/*
* 스프링 빈의 이름을 이렇게 설정
* localhost:8080/springmvc/old-controller에 접속하면
* URI(springmvc/old-controller의 이름으로 된 빈을 찾는다.
*  */
@Component("/springmvc/old-controller")
public class OldController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("OldController.handlerRequest");
        return new ModelAndView("new-form");
    }
}
