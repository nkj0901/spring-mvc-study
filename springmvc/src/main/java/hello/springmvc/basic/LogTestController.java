package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class LogTestController {

    @RequestMapping("/log-test")
    public String LogTest() {
        String name= "Spring";


        System.out.println("name = " + name);

        //이렇게 하면 트레이스니까 출력 안해야지 보다 문자를 더하는 연산이 먼저 일어난다.
        //메모리와 CPU를 사용하게 된다. 이렇게 쓰지말자.
        log.trace("trace log = ", name);

        log.trace("trace log = {} ", name);
        log.debug("debug log = {} ", name);
        log.info("info = log = {} ", name);
        log.warn("warn = log = {} ", name);
        log.error("error = log = {} ", name);

        return "ok";
    }


}
