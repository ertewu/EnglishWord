package zystudio.englishword.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wzy on 5/4/17.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    /**
     * 主页，是一个web表格了，输入内容用来保存的
     */
    @RequestMapping(method = RequestMethod.GET)
    public String homePage(Model model) {
        return "homePage";
    }
}
