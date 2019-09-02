package com.lotto.web.domains;

import java.io.Serializable;

public class ConsumerBean implements Serializable{
private static final long serialVersionUID = 1L;
private String cid, pass, lottoSeq, prizeMoney;
public String getCid() {
	return cid;
}
public void setCid(String cid) {
	this.cid = cid;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getLottoSeq() {
	return lottoSeq;
}
public void setLottoSeq(String lottoSeq) {
	this.lottoSeq = lottoSeq;
}
public String getPrizeMoney() {
	return prizeMoney;
}
public void setPrizeMoney(String prizeMoney) {
	this.prizeMoney = prizeMoney;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
@Override
public String toString() {
	return "ConsumerBean [cid=" + cid + ", pass=" + pass + ", lottoSeq=" + lottoSeq + ", prizeMoney=" + prizeMoney
			+ "]";
}


}
