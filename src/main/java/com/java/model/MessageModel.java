package cn.mi46.model;

public class MessageModel {
    private Integer userId;

    private String text0;

    private String text1;

    private String text2;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getText0() {
        return text0;
    }

    public void setText0(String text0) {
        this.text0 = text0;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    @Override
    public String toString() {
        return "MessageModel{" +
                "userId=" + userId +
                ", text0='" + text0 + '\'' +
                ", text1='" + text1 + '\'' +
                ", text2='" + text2 + '\'' +
                '}';
    }
}