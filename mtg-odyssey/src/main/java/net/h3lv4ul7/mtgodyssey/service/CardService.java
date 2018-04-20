package net.h3lv4ul7.mtgodyssey.service;

import java.util.List;

import net.h3lv4ul7.mtgodyssey.model.Card;

public interface CardService {
	
	Card saveCard(Card card);
	
	Card updateCard(Card card);
		
	Card findCardById(Integer id);
	
	List<Card> findAllCards();
	
	void deleteCard(Card card);

}
