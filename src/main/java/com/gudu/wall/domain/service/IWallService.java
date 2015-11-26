package com.gudu.wall.domain.service;

import com.gudu.wall.domain.api.pojo.AddReplyPojo;
import com.gudu.wall.domain.api.pojo.AddTopicPojo;
import com.gudu.wall.domain.domain.Topic;

import java.io.Serializable;
import java.util.List;

/**
 * Created by qiuhn on 2015/10/18.
 */
public interface IWallService {

    /**
     * 发布主题，
     * @param pojo
     * @return 主题ID
     */
    String addTopic(AddTopicPojo pojo);

    /**
     * 回复主题
     * @param pojo
     * @return 回复ID
     */
    String addReply(AddReplyPojo pojo);

    /**
     * 查询主题列表
     * @param userid
     * @param time
     * @param timeCount
     * @param size
     * @return
     */
    List<Topic> queryTopics(long userid, long time, int timeCount, int size);

}
