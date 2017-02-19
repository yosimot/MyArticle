package jp.techacademy.takahiro.yoshimoto.qa_app;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Yoshimoto Takahiro on 2017/02/11.
 */
public class Question implements Serializable {
    private String mTitle;
    private String mBody;
    private String mUrl;
    private String mName;
    private String mUid;
    private String mQuestionUid;
    private int mGenre;
    private byte[] mBitmapArray;
    private ArrayList<Answer> mAnswerArrayList;

    public String getTitle(){
        return mTitle;
    }

    public String getBody(){
        return mBody;
    }

    public String getUrl(){ return mUrl; }

    public String getName(){
        return mName;
    }

    public String getUid(){
        return mUid;
    }

    public String getQuestionUid(){
        return mQuestionUid;
    }

    public int getGenre(){
        return mGenre;
    }

    public byte[] getImageBytes(){
        return mBitmapArray;
    }

    public ArrayList<Answer> getAnswers(){
        return mAnswerArrayList;
    }

    public Question (String title, String body, String url,  String name, String uid, String questionUid, int genre, byte[] bytes, ArrayList<Answer> answers){
        mTitle = title;
        mBody = body;
        mUrl = url;
        mName = name;
        mUid = uid;
        mQuestionUid = questionUid;
        mGenre = genre;
        mBitmapArray = bytes.clone();
        mAnswerArrayList = answers;
    }
}
