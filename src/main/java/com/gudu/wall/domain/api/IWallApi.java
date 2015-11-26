package com.gudu.wall.domain.api;

import com.gudu.core.response.Response;
import com.gudu.wall.domain.api.pojo.AddReplyPojo;
import com.gudu.wall.domain.api.pojo.AddTopicPojo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by qiuhn on 2015/10/18.
 */
@RequestMapping(value = "forum")
public interface IWallApi {

    @RequestMapping(value = "addTopic")
    @ResponseBody
    public Response addTopic(@RequestBody AddTopicPojo pojo);

    @RequestMapping(value = "/queryTopics")
    @ResponseBody
    public Response queryTopics(long userid,long time,int timeCount,int size);

    @RequestMapping(value = "addReplay")
    @ResponseBody
    public Response addReply(@RequestBody AddReplyPojo pojo);
}
