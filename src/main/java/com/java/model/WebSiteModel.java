package cn.mi46.model;

public class WebSiteModel {
    private Integer userId;

    private String titleName;

    private String kefu;

    private Integer isOn;

    private Integer isPay;

    private String pay;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getKefu() {
        return kefu;
    }

    public void setKefu(String kefu) {
        this.kefu = kefu;
    }

    public Integer getIsOn() {
        return isOn;
    }

    public void setIsOn(Integer isOn) {
        this.isOn = isOn;
    }

    public Integer getIsPay() {
        return isPay;
    }

    public void setIsPay(Integer isPay) {
        this.isPay = isPay;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "WebSiteModel{" +
                "userId=" + userId +
                ", titleName='" + titleName + '\'' +
                ", kefu='" + kefu + '\'' +
                ", isOn=" + isOn +
                ", isPay=" + isPay +
                ", pay='" + pay + '\'' +
                '}';
    }
}