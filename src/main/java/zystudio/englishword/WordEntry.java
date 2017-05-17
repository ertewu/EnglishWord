package zystudio.englishword;

import javax.validation.constraints.NotNull;

/**
 * Created by wzy on 5/4/17.
 */
public class WordEntry {


    private long id;

    @NotNull
    private String word;

    private String createTime;

    private String wordfromTag;

    @NotNull
    private String detailMean;

    private String sentence;

    private String tipUrl;

    private String tipContent;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWordfromTag() {
        return wordfromTag;
    }

    public void setWordfromTag(String wordfromTag) {
        this.wordfromTag = wordfromTag;
    }

    public String getDetailMean() {
        return detailMean;
    }

    public void setDetailMean(String detailMean) {
        this.detailMean = detailMean;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getTipUrl() {
        return tipUrl;
    }

    public void setTipUrl(String tipUrl) {
        this.tipUrl = tipUrl;
    }

    public String getTipContent() {
        return tipContent;
    }

    public void setTipContent(String tipContent) {
        this.tipContent = tipContent;
    }

    public WordEntry() {

    }

    @Override
    public String toString() {
        return "WordEntry{" +
                "id=" + id +
                ", word='" + word + '\'' +
                ", createTime='" + createTime + '\'' +
                ", wordfromTag='" + wordfromTag + '\'' +
                ", detailMean='" + detailMean + '\'' +
                ", sentence='" + sentence + '\'' +
                ", tipUrl='" + tipUrl + '\'' +
                ", tipContent='" + tipContent + '\'' +
                '}';
    }
}
