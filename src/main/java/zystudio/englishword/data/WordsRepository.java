package zystudio.englishword.data;

import org.springframework.stereotype.Component;
import zystudio.englishword.WordEntry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zylab on 2017/12/28.
 */
@Component
public class WordsRepository {

    private List<WordEntry>  mDataList;

    public WordsRepository(){

        System.out.println("WordsRepository constructor occured");
        mDataList=new ArrayList<WordEntry>();

        WordEntry entry1=new WordEntry();
        entry1.setDetailMean("setDetailMean");
        entry1.setWord("setWord");

        WordEntry entry2=new WordEntry();
        entry2.setDetailMean("setDetailMean2");
        entry2.setWord("setWord2");

        mDataList.add(entry1);
        mDataList.add(entry2);
    }

    public void saveWord(WordEntry entry){

        if(entry!=null){
            mDataList.add(entry);
        }
    }

    public List<WordEntry> getAllWords(){
        return mDataList;
    }
}
