package net.h3lv4ul7.mtgodyssey.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.h3lv4ul7.mtgodyssey.model.Card;
import net.h3lv4ul7.mtgodyssey.repository.CardRepository;

@Service
public class CardServiceImpl implements CardService {
	
	private CardRepository cardRepository;
	
	public CardServiceImpl(CardRepository cardRepository) {
		this.cardRepository = cardRepository;
	}

	@Override
	public Card saveCard(Card card) {
		return cardRepository.save(card);
	}

	@Override
	public Card updateCard(Card card) {
		return cardRepository.save(card);
	}

	@Override
	public Card findCardById(Integer id) {
		return cardRepository.findById(id).get();
	}

	@Override
	public List<Card> findAllCards() {
		return (List<Card>) cardRepository.findAll();
	}

	@Override
	public void deleteCard(Card card) {
		cardRepository.delete(card);

	}

}
