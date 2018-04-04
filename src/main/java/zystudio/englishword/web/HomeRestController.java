package zystudio.englishword.web;

import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import zystudio.englishword.WordEntry;
import zystudio.englishword.data.WordsRepository;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zylab on 2017/12/28.
 */
@RestController
public class HomeRestController {

    private WordsRepository mRepo;

    public HomeRestController(){
        System.out.println("HomeRestController constructor occured");
        mRepo=new WordsRepository();
    }

    @RequestMapping(value = "uploadword", method = RequestMethod.POST)
    public String uploadWord(@Valid WordEntry wordentry, Errors errors) {

        System.out.println("zystudio my uploadword void occured:" + wordentry);
        mRepo.saveWord(wordentry);
        Map<String,String> result=new HashMap<String, String>();
        if (errors.hasErrors()) {
            return "this is Err" ;
        }
        result.put("key","ZYStudioValue");
        return "this is good From RestController";
    }

    //据说在restController里, @ResponseBody也不用写了,produces="application/json"也不用写了...
    @RequestMapping(value="getwords2",method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<WordEntry> getWordsRestController(@RequestHeader("Accept") String accept){

        System.out.println("getWordsRestController occured accept is:"+accept);
        return mRepo.getAllWords();
    }

}
