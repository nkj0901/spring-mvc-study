package hello.exception.resolver;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Slf4j
public class MyHandlerExceptionResolver implements HandlerExceptionResolver {


    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

        try {

            //예외 먹어버리기
            if (ex instanceof IllegalArgumentException) {
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, ex.getMessage());
                log.info("IllegalArgumentException resolver to 400");
                return new ModelAndView();
            }

        } catch (IOException e) {
            log.error("resolver ex", e);
        }

        //리턴 널이면 그냥 예외가 터져서 날아간ㄷㅏ.
        return null;
    }
}
