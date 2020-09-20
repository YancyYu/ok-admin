package cn.mi46.model;

import java.util.Date;

public class IosModel {
    private Integer id;

    private String title;

    private String img;

    private String titlemini;

    private Integer userid;

    private String url;

    private Integer pxId;

    private Integer code;

    private Integer isCode;

    private Date date;

    private Integer pay;

    private Double payMeny;

    private Double paySw;

    private Integer iocn;

    private String text;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitlemini() {
        return titlemini;
    }

    public void setTitlemini(String titlemini) {
        this.titlemini = titlemini;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPxId() {
        return pxId;
    }

    public void setPxId(Integer pxId) {
        this.pxId = pxId;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getIsCode() {
        return isCode;
    }

    public void setIsCode(Integer isCode) {
        this.isCode = isCode;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getPay() {
        return pay;
    }

    public void setPay(Integer pay) {
        this.pay = pay;
    }

    public Double getPayMeny() {
        return payMeny;
    }

    public void setPayMeny(Double payMeny) {
        this.payMeny = payMeny;
    }

    public Double getPaySw() {
        return paySw;
    }

    public void setPaySw(Double paySw) {
        this.paySw = paySw;
    }

    public Integer getIocn() {
        return iocn;
    }

    public void setIocn(Integer iocn) {
        this.iocn = iocn;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "IosModel{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", img='" + img + '\'' +
                ", titlemini='" + titlemini + '\'' +
                ", userid=" + userid +
                ", url='" + url + '\'' +
                ", pxId=" + pxId +
                ", code=" + code +
                ", isCode=" + isCode +
                ", date=" + date +
                ", pay=" + pay +
                ", payMeny=" + payMeny +
                ", paySw=" + paySw +
                ", iocn=" + iocn +
                ", text='" + text + '\'' +
                '}';
    }
}