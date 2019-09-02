package com.lotto.web.serviceimpls;

import java.util.Arrays;
import java.util.Random;
import com.lotto.web.daoimpls.LottoDaoimpl;
import com.lotto.web.daos.LottoDao;
import com.lotto.web.domains.LottoBean;
import com.lotto.web.services.LottoService;

public class LottoServiceImpl implements LottoService{
	private LottoDao dao;
	private	Random ran;
	
	public LottoServiceImpl() {
		dao = new LottoDaoimpl();
	}

	public void createLotto(LottoBean param) {
		LottoBean bean = new LottoBean();
		bean.setBall(createball());
		bean.setLotteryNum(createLotteryNum());
		bean.setLottoSeq(createLottoSeq());
		dao.inserLotto(bean);
	}

	public String createLottoSeq() {
		ran = new Random();
		String seq ="No.";
		for(int i=0; i<4; i++) {
			seq += ran.nextInt(10)+"";
		}
		System.out.println(seq);
		return seq;
	}

	public String createball() {
		return new Random().nextInt(45)+1+"";
	}
	
	public String createLotteryNum() {
		String lotto = "";
		int[] arr = new int[6];
		ran = new Random();
		for(int i=0; i<5; i++) {
			int a = (ran.nextInt(45)+1); //
			if(duplicatePrevention(arr, a)){
				arr[i] = a;
			}

		}
		Arrays.sort(arr); //ascendingSort
		for(int i=0; i<6; i++) {
			if(i<5) {
				lotto += arr[i] + ","; 				
			}else {
				lotto += arr[i];
			}
		}
		System.out.println(lotto);
		return lotto;
	}
	
	public boolean duplicatePrevention(int[] arr, int a) {
		boolean flag = false;
		for(int i=0; i<6; i++) {
			if(arr[i]==a) {
				flag = false;
				break;
			}else {
				flag = true;
			}
		}
		return flag;
	}

	public String ascendingSort(int[] arr) {
		String result ="";
		return result;
	}
}
