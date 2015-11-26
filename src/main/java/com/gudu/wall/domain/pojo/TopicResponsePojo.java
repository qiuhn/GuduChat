package com.gudu.wall.domain.pojo;

import com.gudu.wall.domain.domain.Topic;

import java.util.Set;

/**
 * Created by qiuhn on 2015/11/25.
 */
public class TopicResponsePojo {

    private String id;

    private String title;

    private String content;

    private String imgs;

    private long userId;

    private long createDate;

    private int schoolId;


    private int likeCount;//赞的个数

    //0正常
    private byte status;

    private int replyCount;


    //最后更新时间
    private long latestUpdateTime;

    private byte meLike;

    public TopicResponsePojo() {
    }

    public TopicResponsePojo(String id, String title, String content, String imgs, long userId, long createDate, int schoolId, int likeCount, byte status, int replyCount, long latestUpdateTime, byte meLike) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.imgs = imgs;
        this.userId = userId;
        this.createDate = createDate;
        this.schoolId = schoolId;
        this.likeCount = likeCount;
        this.status = status;
        this.replyCount = replyCount;
        this.latestUpdateTime = latestUpdateTime;
        this.meLike = meLike;
    }
    public TopicResponsePojo(Topic topic ){
        this.id = topic.getId();
        this.title = topic.getTitle();
        this.content = topic.getContent();
        this.imgs = topic.getImgs();
        this.userId = topic.getUserId();
        this.createDate = topic.getCreateDate();
        this.schoolId = topic.getSchoolId();
        this.likeCount = topic.getPraiseCount();
        this.status = topic.getStatus();
        this.replyCount = topic.getReplyCount();
        this.latestUpdateTime = topic.getLatestUpdateTime();
        this.meLike = (byte)topic.getMeLike();
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

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
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

    public byte getMeLike() {
        return meLike;
    }

    public void setMeLike(byte meLike) {
        this.meLike = meLike;
    }
}
