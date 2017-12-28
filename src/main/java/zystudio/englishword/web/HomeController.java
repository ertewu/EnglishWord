package zystudio.englishword.web;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import zystudio.englishword.WordEntry;

import java.util.HashMap;
import java.util.Map;

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
        System.out.println("homePage occured:");
        model.addAttribute("wordentry", new WordEntry());
        return "homePage";
    }


    //这个并没跑通..这个map的并没跑通
//    @RequestMapping(value = "uploadword", method = RequestMethod.POST)
//    public Map<String,String> uploadWord(@Valid WordEntry wordentry, Errors errors) {
//        System.out.println("zystudio uploadword occured:" + wordentry);
//        Map<String,String> result=new HashMap<String, String>();
//        if (errors.hasErrors()) {
//            return result;
//        }
//        result.put("key","ZYStudioValue");
//        return result;
//    }

    // 这个是最原始的那个,就是我能验证post达到目的,但是返回页面错误的
//    @RequestMapping(value = "uploadword", method = RequestMethod.POST)
//    public String uploadWord(@Valid WordEntry wordentry, Errors errors) {
//        System.out.println("zystudio uploadword occured:" + wordentry);
//        if (errors.hasErrors()) {
//            return "";
//        }
//        return "";
//    }

    // 加了ResponseBody之后, 返回内容会直接当作网页的内容返回;否则的话,其认为是一个页面的代表的
//    @RequestMapping(value = "uploadword", method = RequestMethod.POST)
//    @ResponseBody
//    public String uploadWord(@Valid WordEntry wordentry, Errors errors) {
//        System.out.println("zystudio uploadword occured:" + wordentry);
//        if (errors.hasErrors()) {
//            return "hehe2";
//        }
//        return "hehe";
//    }

//    @RequestMapping(value = "uploadword", method = RequestMethod.POST)
//    public String uploadword(WordEntry wordentry) {
//        System.out.println("uploadword 2 occured:" + wordentry);
//        return "";
//    }
//
//    @RequestMapping(method = RequestMethod.POST)
//    public String homePage(WordEntry wordentry) {
//        System.out.println("uploadword 3occured:" + wordentry);
//        return "";
//    }
}
