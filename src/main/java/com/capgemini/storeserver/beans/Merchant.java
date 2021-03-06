package com.capgemini.storeserver.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Merchant {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int merchantId;
	private boolean isThirdPartyMerchant;
	@OneToMany(mappedBy="merchant",cascade=CascadeType.ALL)
	private List<Product> products = new ArrayList<>();
	private Date addMerchantDate;
	
	private String password;
	private String email;
	private String phoneNumber;
	private Date removeMerchantDate;
	private String merchantName;
	private String merchantStatus;
	private String securityQuestion;
	private String securityAnswer;
	@ManyToOne
	@JoinColumn(name="adminId")
	private Admin admin;
	
	
	public Merchant() {
		super();
	}
	
	public Merchant(int merchantId) {
		super();
		this.merchantId = merchantId;
	}

	
	public Date getRemoveMerchantDate() {
		return removeMerchantDate;
	}
	public void setRemoveMerchantDate(Date removeMerchantDate) {
		this.removeMerchantDate = removeMerchantDate;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantStatus() {
		return merchantStatus;
	}
	public void setMerchantStatus(String merchantStatus) {
		this.merchantStatus = merchantStatus;
	}
	@ManyToOne
	@JoinColumn(name="orderId")
	private Orders order;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}
	public boolean isThirdPartyMerchant() {
		return isThirdPartyMerchant;
	}
	public void setThirdPartyMerchant(boolean isThirdPartyMerchant) {
		this.isThirdPartyMerchant = isThirdPartyMerchant;
	}
	
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Orders getOrder() {
		return order;
	}
	public void setOrder(Orders order) {
		this.order = order;
	}
	public Date getAddMerchantDate() {
		return addMerchantDate;
	}
	public void setAddMerchantDate(Date addMerchantDate) {
		this.addMerchantDate = addMerchantDate;
	}
	public String getSecurityQuestion() {
		return securityQuestion;
	}
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	public String getSecurityAnswer() {
		return securityAnswer;
	}
	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + merchantId;
		return result;
	}
	
	
	
}
