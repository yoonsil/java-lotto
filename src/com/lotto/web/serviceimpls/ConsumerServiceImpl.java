package com.lotto.web.serviceimpls;

import com.lotto.web.daoimpls.ConsumerDaoimpl;
import com.lotto.web.daos.ConsumerDao;
import com.lotto.web.domains.ConsumerBean;
import com.lotto.web.services.ConsumerService;

public class ConsumerServiceImpl implements ConsumerService{
	private ConsumerDao dao; //메소드에서 공유

	public ConsumerServiceImpl() {
		dao = new ConsumerDaoimpl();
	}
	
	public void registerConsumer(ConsumerBean param) {
		dao.insertConsumer(param);
	}


}
