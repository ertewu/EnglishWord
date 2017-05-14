package zystudio.englishword.web;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import zystudio.englishword.WordEntry;

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
        model.addAttribute("wordEntry",new WordEntry());
        return "homePage";
    }

    @RequestMapping(value = "/uploadword", method = RequestMethod.POST)
    public String uploadWord(@Valid WordEntry entry, Errors errors) {
        System.out.println("uploadword occured:" + entry);
        if (errors.hasErrors()) {
            return "";
        }
        return "";
    }

}
