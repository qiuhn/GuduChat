package com.gudu.wall.domain.dao;

import com.gudu.base.IBaseDao;
import com.gudu.wall.domain.domain.Topic;

import java.util.List;

/**
 * Created by qiuhn on 2015/10/18.
 */
public interface ITopicDao extends IBaseDao{
    /**
     * 查询对话列表
     * @param time
     * @param timeCount
     * @param size
     * @param schoolId
     * @return
     */
    List<Topic> queryTopics(long time, int timeCount, int size, int...schoolId);
}
