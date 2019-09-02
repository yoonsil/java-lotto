package com.lotto.web.daoimpls;

import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;

import com.lotto.web.daos.ConsumerDao;
import com.lotto.web.domains.ConsumerBean;

public class ConsumerDaoimpl implements ConsumerDao{
	public static final String FILE_PATH = String.format("C:%sUsers%sthisi%seclipse_jee%sjee-lotto%sWebContent%sresources%stxt%s"
			,File.separator
			,File.separator
			,File.separator
			,File.separator
			,File.separator
			,File.separator
			,File.separator
			,File.separator);
	@Override
	public void insertConsumer(ConsumerBean param) {
		try {
			File file = new File(FILE_PATH+"consumers.txt");
			@SuppressWarnings("resource")
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
	//		BufferedReader reader = new BufferedReader(new FileReader(file));
			writer.write(String.format("%s, %s", param.getCid(),param.getPass()));
			writer.newLine();//줄바꿈
			writer.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
