package xyz.vopen.passport.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import xyz.vopen.passport.dao.PassportDAO;

/**
 * 持久层支持
 * Created by ive on 03/11/2016.
 */
public class DubboServiceSupport {

    /**
     * 账号持久层接口
     */
    protected PassportDAO passportDAO;
    
    /**
     * default redis template client <br/>
     */
    protected RedisTemplate<String, String> redisTemplate;

    public PassportDAO getPassportDAO () {
        return passportDAO;
    }

    @Autowired
    public void setPassportDAO (PassportDAO passportDAO) {
        this.passportDAO = passportDAO;
    }

    @Autowired(required = false)
    public void setRedisTemplate (RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }


}
