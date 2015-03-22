package com.foxinmy.weixin4j.msg.event;

import com.foxinmy.weixin4j.type.EventType;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 客服接入会话事件
 * 
 * @className KfCreateEventMessage
 * @author jy
 * @date 2015年3月22日
 * @since JDK 1.7
 * @see <a
 *      href="http://mp.weixin.qq.com/wiki/2/6c20f3e323bdf5986cfcb33cbd3b829a.html#.E4.BC.9A.E8.AF.9D.E7.8A.B6.E6.80.81.E9.80.9A.E7.9F.A5.E4.BA.8B.E4.BB.B6">会话状态通知事件</a>
 */
public class KfCreateEventMessage extends EventMessage {
	
	private static final long serialVersionUID = -8968189700999202108L;

	public KfCreateEventMessage() {
		super(EventType.kf_create_session);
	}

	@XStreamAlias("KfAccount")
	private String kfAccount; // 客服账号

	public String getKfAccount() {
		return kfAccount;
	}

	public void setKfAccount(String kfAccount) {
		this.kfAccount = kfAccount;
	}

	@Override
	public String toString() {
		return "KfCreateEventMessage [kfAccount=" + kfAccount + ", ="
				+ super.toString() + "]";
	}
}
