package cn.xiaowenjie.webperformance;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description TODO
 * @Date 2021/1/2 0002
 * @Author 晓风轻 https://github.com/xwjie
 */
@Controller
public class StaticController {

    @GetMapping(value = "/js/{type}-load-{loadTime}-sleep-{sleepTime}.js",
        produces="application/javascript")
    public String getJsFile(Model model, @PathVariable("type") String type,
                            @PathVariable("loadTime") int loadTime,
                            @PathVariable("sleepTime") int sleepTime
    ) {
        model.addAttribute("type", type);
        model.addAttribute("loadTime", loadTime);
        model.addAttribute("sleepTime", sleepTime);

        return "js-template.js";
    }
}
