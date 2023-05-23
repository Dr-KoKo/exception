package hello.exception.servlet;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/error-page")
public class ErrorPageController {

    @RequestMapping("/404")
    public String errorPage404() {
        log.info("errorPage 404");
        return "error-page/404";
    }

    @RequestMapping("/500")
    public String errorPage500() {
        log.info("errorPage 500");
        return "error-page/500";
    }
}
