package com.example.huangjianpeng.reportcard;

/**
 * Created by huangjianpeng on 2017/7/1.
 */

public class ReportCard {
    public static final int SUMMERTERM = 0;
    public static final int WINRERTERM = 1;
    private int mYear;
    private int mTerm;
    private int mChinese;
    private int mMaths;
    private int mEnglish;

    public ReportCard(int mYear, int mTerm) {
        this.mYear = mYear;
        this.mTerm = mTerm;
        this.mChinese = 0;
        this.mMaths = 0;
        this.mEnglish = 0;
    }

    public void setmChinese(int mChinese) {
        this.mChinese = mChinese;
    }

    public void setmMaths(int mMaths) {
        this.mMaths = mMaths;
    }

    public void setmEnglish(int mEnglish) {
        this.mEnglish = mEnglish;
    }

    public int getmYear() {
        return mYear;
    }

    public int getmTerm() {
        return mTerm;
    }

    public int getmChinese() {
        return mChinese;
    }

    public int getmMaths() {
        return mMaths;
    }

    public int getmEnglish() {
        return mEnglish;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "mYear=" + mYear +
                ", mTerm=" + (mTerm == SUMMERTERM? "summer":"winter") +
                ", mChinese=" + mChinese +
                ", mMaths=" + mMaths +
                ", mEnglish=" + mEnglish +
                '}';
    }
}
