package com.zcbspay.platform.business.commons.bean;

import java.io.Serializable;

public class CardBin implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**卡bin**/
    private String cardBin;
    /**卡长度**/
    private String cardLen;
    /**kabin长度**/
    private String binLen;
    /**卡名**/
    private String cardName;
    /**发卡行名称**/
    private String bankCode;
    /**卡类型**/
    private String Type;
    /**银行名称**/
    private String bankName;
    
    

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCardBin() {
        return cardBin;
    }

    public void setCardBin(String cardBin) {
        this.cardBin = cardBin;
    }

    public String getCardLen() {
        return cardLen;
    }

    public void setCardLen(String cardLen) {
        this.cardLen = cardLen;
    }
    public String getBinLen() {
        return binLen;
    }

    public void setBinLen(String binLen) {
        this.binLen = binLen;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }


    
    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
    
    


}
