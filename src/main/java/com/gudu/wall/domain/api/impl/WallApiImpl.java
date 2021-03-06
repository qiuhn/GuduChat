package com.gudu.wall.domain.api.impl;

import com.gudu.core.response.Response;
import com.gudu.wall.domain.api.IWallApi;
import com.gudu.wall.domain.api.pojo.AddReplyPojo;
import com.gudu.wall.domain.api.pojo.AddTopicPojo;
import com.gudu.wall.domain.domain.Topic;
import com.gudu.wall.domain.pojo.TopicResponsePojo;
import com.gudu.wall.domain.service.IWallService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by qiuhn on 2015/10/18.
 */
@Controller
public class WallApiImpl implements IWallApi{


    @Inject
    private IWallService wallService;

    @Override
    public Response addTopic(@RequestBody AddTopicPojo pojo) {
        Response response = new Response();
        try{
            for (int i=0;i<100;i++){
                AddTopicPojo pojo1 = new AddTopicPojo();
                pojo1.setSchoolId(0);
                pojo1.setTitle("test" + i);
                pojo1.setUserId(0);
                pojo1.setContent("content"+i);
                String id =  wallService.addTopic(pojo);
            }

            response.setObj(0);
        }catch (Exception e){
            response.setCode(0);
            e.printStackTrace();
        }
        return response;
    }

    @Override
    public Response queryTopics(long userid, long time, int timeCount, int size) {
        Response response = new Response();
        try {
            List<Topic> topics = wallService.queryTopics(userid,time,timeCount,size);
            System.out.println("topics:"+topics);
            response.setObj(topics);
        }catch (Exception e){
            response.setCode(0);
            e.printStackTrace();
        }
        return response;
    }

    @Override
    public Response addReply(@RequestBody AddReplyPojo pojo) {

        Response response = new Response();
        try{
            String id =  wallService.addReply(pojo);
            response.setObj(id);
        }catch (Exception e){
            response.setCode(0);
            e.printStackTrace();
        }
        return response;
    }
}
