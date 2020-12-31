package cn.xiaowenjie.webperformance;

import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Random;

/**
 * @Description TODO
 * @Date 2020/12/31 0031
 * @Author 晓风轻 https://github.com/xwjie
 */
@Component
public class SleepTimeFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @SneakyThrows
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) {
        HttpServletRequest request = (HttpServletRequest) servletRequest;

        int millis = new Random().nextInt(2000);
        System.out.println("SleepTimeFilter , URL: "
            + request.getRequestURI()
            + ", method: " + request.getMethod()
            + ", sleep: " + millis);
        Thread.sleep(millis);


        //执行
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}