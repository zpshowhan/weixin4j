package com.foximy.weixin4j.example.server.handler;

import com.foxinmy.weixin4j.exception.WeixinException;
import com.foxinmy.weixin4j.handler.MessageHandlerAdapter;
import com.foxinmy.weixin4j.mp.event.ScribeEventMessage;
import com.foxinmy.weixin4j.request.WeixinRequest;
import com.foxinmy.weixin4j.response.TextResponse;
import com.foxinmy.weixin4j.response.WeixinResponse;

/**
 * 处理关注消息
 * 
 * @className SubscribeMessageHandler
 * @author jy
 * @date 2015年12月3日
 * @since JDK 1.7
 * @see
 */
public class SubscribeMessageHandler extends
		MessageHandlerAdapter<ScribeEventMessage> {

	@Override
	public WeixinResponse doHandle0(WeixinRequest arg0, ScribeEventMessage arg1)
			throws WeixinException {
		return new TextResponse("欢迎关注～");
	}
}
