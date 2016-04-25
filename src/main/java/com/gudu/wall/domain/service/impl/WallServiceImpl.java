package com.gudu.wall.domain.service.impl;

import com.gudu.util.DateUtil;
import com.gudu.wall.domain.api.pojo.AddReplyPojo;
import com.gudu.wall.domain.api.pojo.AddTopicPojo;
import com.gudu.wall.domain.dao.IReplyDao;
import com.gudu.wall.domain.dao.ITopicDao;
import com.gudu.wall.domain.domain.Reply;
import com.gudu.wall.domain.domain.Topic;
import com.gudu.wall.domain.service.IWallService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

/**
 * Created by qiuhn on 2015/10/18.
 */
@Service("wallService")
public class WallServiceImpl implements IWallService {

    @Inject
    private ITopicDao topicDao;

    @Inject
    private IReplyDao replyDao;


    @Override
    @Transactional
    public String addTopic(AddTopicPojo pojo) {
        //查询指定用户所在学校
        int schoolId = 0;
        //保存主题
        Topic topic = new Topic();
        topic.setContent(pojo.getContent());
        topic.setCreateDate(DateUtil.getNanoTime());
        topic.setDisplay(true);
        topic.setImgs(pojo.getImgs());
        topic.setIp(pojo.getIp());
        topic.setMac(pojo.getMac());
        topic.setSchoolId(schoolId);
        topic.setTitle(pojo.getTitle());
        topic.setUserId(pojo.getUserId());
        Serializable id = topicDao.save(topic);
        if(id==null){
            return null;
        }
        return (String) topicDao.save(topic);
    }

    @Override
    @Transactional
    public String addReply(AddReplyPojo pojo) {
        //查询最大楼层
       Object obj = topicDao.loadById(pojo.getTopicId());
        if(obj == null){
            return null;
        }
        Topic topic = (Topic) obj;
        int replyCount = topic.getReplyCount()+1;
        //保存评论
        Reply reply = new Reply();
        reply.setUserId(pojo.getUserid());
        reply.setContent(pojo.getContent());
        reply.setCreateDate(DateUtil.getNanoTime());
        reply.setImgs(pojo.getImgs());
        reply.setIndex(replyCount);
        Serializable id = replyDao.save(reply);
        if(id == null){
            return null;
        }
        topic.setReplyCount(replyCount);
        return (String) id;
    }

    @Override
    public List<Topic> queryTopics(long userid, long time, int timeCount, int size) {
        //通过userid查询用户关注的学校
        int schoolId = 0;
        List<Topic> topics = topicDao.queryTopics(time,timeCount,size,schoolId);
        return topics;
    }
}
