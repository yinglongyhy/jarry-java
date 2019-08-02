package com.yinglongyhy.o2o.repository;

import com.yinglongyhy.o2o.entity.WechatAuth;
import org.springframework.stereotype.Repository;

@Repository
public interface WechatAuthRepository {
	/**
	 * 
	 * @param openId
	 * @return
	 */
	WechatAuth queryWechatInfoByOpenId(String openId);

	/**
	 * 
	 * @param wechatAuth
	 * @return
	 */
	int insertWechatAuth(WechatAuth wechatAuth);

	/**
	 * 
	 * @param wechatAuthId
	 * @return
	 */
	int deleteWechatAuth(Long wechatAuthId);
}
