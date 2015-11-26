package com.gudu.wall.domain.api.pojo;

/**
 * Created by qiuhn on 2015/10/19.
 */
public class AddReplyPojo {

    private String topicId;

    private long userid;

    private String content;

    private String imgs;

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
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
}
