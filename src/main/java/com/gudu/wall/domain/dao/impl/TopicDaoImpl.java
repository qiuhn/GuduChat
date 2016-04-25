package com.gudu.wall.domain.dao.impl;

import com.gudu.base.BaseDaoImpl;
import com.gudu.wall.domain.dao.ITopicDao;
import com.gudu.wall.domain.domain.Topic;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by qiuhn on 2015/10/18.
 */
@Repository("topicDao")
public class TopicDaoImpl extends BaseDaoImpl<Topic> implements ITopicDao {


    @Override
    public List<Topic> queryTopics(long time, int timeCount, int size, int... schoolId) {
        System.out.println(time);
        List<Topic> list = null;
        if (time == 0) {
            String sql = "SELECT *  FROM t_wall_topic  WHERE schoolId IN(?) ORDER BY createDate DESC LIMIT 0,?";
            Object[] args = new Object[2];
            args[0] = schoolId;
            args[1] = size;
            list = getJdbcTemplate().query(sql, args, new BeanPropertyRowMapper<Topic>(Topic.class));
        } else {
            String sql = "select *  from t_wall_topic  where createDate<? and schoolId in(?)  ORDER BY createDate DESC  limit 0,?";
            Object[] args = new Object[3];
            args[0] = time;
            args[1] = schoolId;
            args[2] = size;
            list = getJdbcTemplate().query(sql, args, new BeanPropertyRowMapper<Topic>(Topic.class));
        }
        return list;
    }
}
