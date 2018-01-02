package zystudio.englishword.web;

import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import zystudio.englishword.WordEntry;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zylab on 2017/12/28.
 */
@RestController
public class HomeRestController {

    @RequestMapping(value = "uploadword", method = RequestMethod.POST)
    public String uploadWord(@Valid WordEntry wordentry, Errors errors) {
        System.out.println("zystudio my uploadword void occured:" + wordentry);
        Map<String,String> result=new HashMap<String, String>();
        if (errors.hasErrors()) {
            return "this is Err" ;
        }
        result.put("key","ZYStudioValue");
        return "this is good From RestController";
    }
}
