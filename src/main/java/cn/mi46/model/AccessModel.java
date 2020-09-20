package cn.mi46.model;

public class AccessModel {
    private Integer userId;

    private Integer ipnum;

    private Integer todaynum;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIpnum() {
        return ipnum;
    }

    public void setIpnum(Integer ipnum) {
        this.ipnum = ipnum;
    }

    public Integer getTodaynum() {
        return todaynum;
    }

    public void setTodaynum(Integer todaynum) {
        this.todaynum = todaynum;
    }

    @Override
    public String toString() {
        return "AccessModel{" +
                "userId=" + userId +
                ", ipnum=" + ipnum +
                ", todaynum=" + todaynum +
                '}';
    }
}