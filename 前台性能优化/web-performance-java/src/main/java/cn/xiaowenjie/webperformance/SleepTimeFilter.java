package cn.xiaowenjie.webperformance;

import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.util.Random;

/**
 * @Description TODO
 * @Date 2020/12/31 0031
 * @Author 晓风轻 https://github.com/xwjie
 */
@Component
public class SleepTimeFilter implements Filter {

    public static final String LOAD = "load-";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @SneakyThrows
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        final String filename = request.getRequestURI().substring(request.getRequestURI().lastIndexOf('/'));

        int millis = getLoadTimeFromFileName(filename);
        // int millis = new Random().nextInt(2000);
        // int millis = 1000;
        System.out.println("SleepTimeFilter , URL: "
            + request.getRequestURI()
            + ", method: " + request.getMethod()
            + ", sleep: " + millis);
        Thread.sleep(millis);


        //执行
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public static int getLoadTimeFromFileName(final String filename) {

        int start = filename.indexOf(LOAD);

        if (start < 0) {
            return new Random().nextInt(1000);
        }

        start += +LOAD.length();

        int end = filename.indexOf('-', start);

        if (end < 0) {
            end = filename.indexOf('.', start);
        }

        return Integer.parseInt(filename.substring(start, end));
    }

    @Override
    public void destroy() {

    }
}