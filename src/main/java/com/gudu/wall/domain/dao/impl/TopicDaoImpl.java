package com.gudu.wall.domain.dao.impl;

import com.gudu.base.BaseDaoImpl;
import com.gudu.wall.domain.dao.ITopicDao;
import com.gudu.wall.domain.domain.Topic;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by qiuhn on 2015/10/18.
 */
@Repository("topicDao")
public class TopicDaoImpl extends BaseDaoImpl implements ITopicDao {


    @Override
    public List<Topic> queryTopics(long time, int timeCount, int size, int...schoolId) {
        String sql = "select * from (select *  from t_wall_topic where createDate<? and schoolId in(?) limit 0,?)";
        Object[] args = new Object[3];
        args[0] = time;
        args[1] = schoolId;
        args[2] = size;
        List<Topic> list = getJdbcTemplate().queryForList(sql, args, Topic.class);
        return list;
    }
}
