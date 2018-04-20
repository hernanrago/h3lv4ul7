package net.h3lv4ul7.mtgodyssey.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Stock {
	
	private Integer id;
	private User chargeUser;
	private Card card;
	private LocalDate chargeDate;
	private BigDecimal purchasePrice;
	private BigDecimal salePrice;
	private LocalDate saleDate;
	private User saleUser;
	private Customer customer;
	private CardCondition cardCondition;
	private SaleCondition saleCondition;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User getChargeUser() {
		return chargeUser;
	}
	public void setChargeUser(User chargeUser) {
		this.chargeUser = chargeUser;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public LocalDate getChargeDate() {
		return chargeDate;
	}
	public void setChargeDate(LocalDate chargeDate) {
		this.chargeDate = chargeDate;
	}
	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public BigDecimal getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}
	public LocalDate getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(LocalDate saleDate) {
		this.saleDate = saleDate;
	}
	public User getSaleUser() {
		return saleUser;
	}
	public void setSaleUser(User saleUser) {
		this.saleUser = saleUser;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public CardCondition getCardCondition() {
		return cardCondition;
	}
	public void setCardCondition(CardCondition cardCondition) {
		this.cardCondition = cardCondition;
	}
	public SaleCondition getSaleCondition() {
		return saleCondition;
	}
	public void setSaleCondition(SaleCondition saleCondition) {
		this.saleCondition = saleCondition;
	}
	
}



