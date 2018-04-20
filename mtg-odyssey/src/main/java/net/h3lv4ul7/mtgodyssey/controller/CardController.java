package net.h3lv4ul7.mtgodyssey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import net.h3lv4ul7.mtgodyssey.model.Card;
import net.h3lv4ul7.mtgodyssey.service.CardService;

@Controller
public class CardController {

	private CardService cardService;

	public CardController(CardService cardService) {
		this.cardService = cardService;
	}

	@GetMapping("/card-form")
	public ModelAndView showCardForm() {
		return new ModelAndView("card-form", "card", new Card());
	}

	@PostMapping("/card-save")
	public String saveCard (Card card){
		cardService.saveCard(card);
		return "redirect:/all-cards";
		
	}
	
	@GetMapping("/all-cards")
	public ModelAndView showAllCards() {
		return new ModelAndView("all-cards",
				"cards", cardService.findAllCards());
	}

}
