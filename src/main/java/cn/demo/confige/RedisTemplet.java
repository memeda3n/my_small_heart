package cn.demo.confige;

import java.awt.List;
import java.util.Collection;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;

public class RedisTemplet {

	@Resource
	private RedisTemplate<String, Object> redisTemplate;


	/**
	 * redis 判断key存在
	 */

	public boolean hasKey(String key){

		try {
			return redisTemplate.hasKey(key);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public void set(String key,Object value){
		try {
			redisTemplate.opsForValue().set(key, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void hset(String key ,Map<String, Object> map){
		try {
			redisTemplate.opsForHash().putAll(key, map);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void leftList(String key,Object value){
		try {
			redisTemplate.opsForList().leftPush(key, value);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void leftListAll(String key,List values){
		try {
			redisTemplate.opsForList().leftPushAll(key, values);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void leftListAll(String key,Collection values){
		try {
			redisTemplate.opsForList().leftPushAll(key, values);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public Object getList(String key){
		return  redisTemplate.opsForList().leftPop(key);
	}
	
	
}
