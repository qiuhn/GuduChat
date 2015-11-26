package com.gudu.wall.domain.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by qiuhn on 2015/10/18.
 */
public class Topic {

    private String id;

    private String title;

    private String content;

    private String imgs;

    private long userId;

    private long createDate;

    private int schoolId;

    private Set<String> praiseUserIds ;//赞

    private int praiseCount;//赞的个数

    //0正常
    private byte status;

    private boolean display;

    private int replyCount;


    //最后更新时间
    private long latestUpdateTime;

    private int meLike;//1是 0否


    private String ip;//发表帖子的IP地址

    private String mac;//发表帖子的MAC地址


    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(long createDate) {
        this.createDate = createDate;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public int getPraiseCount() {
        return praiseCount;
    }

    public void setPraiseCount(int praiseCount) {
        this.praiseCount = praiseCount;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }


    public Set<String> getPraiseUserIds() {
        return praiseUserIds;
    }

    public void setPraiseUserIds(Set<String> praiseUserIds) {
        this.praiseUserIds = praiseUserIds;
    }

    public boolean isDisplay() {
        return display;
    }

    public void setDisplay(boolean display) {
        this.display = display;
    }

    public int getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(int replyCount) {
        this.replyCount = replyCount;
    }


    public long getLatestUpdateTime() {
        return latestUpdateTime;
    }

    public void setLatestUpdateTime(long latestUpdateTime) {
        this.latestUpdateTime = latestUpdateTime;
    }

    public int getMeLike() {
        return meLike;
    }

    public void setMeLike(int meLike) {
        this.meLike = meLike;
    }
}
