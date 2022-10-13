package com.springProject.TestSpringProject;

import com.springProject.TestSpringProject.Mappers.Card;
import com.springProject.TestSpringProject.Mappers.CardDTO;
import com.springProject.TestSpringProject.Mappers.CardMapper;
import com.springProject.TestSpringProject.Mappers.CardMapperImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSpringProjectApplication {

	public static void main(String[] args) {
		CardMapper cardMapper = new CardMapperImpl();
		Card card = new Card();
		CardDTO cardDTO = new CardDTO();

		System.out.println(cardDTO);

		card.setRank('K');
		card.setSuit("Diamonds");
		card.setNumericalRank(13);

		cardDTO = cardMapper.cardToCardDTO(card);

		System.out.println(cardDTO);

		SpringApplication.run(TestSpringProjectApplication.class, args);
	}

}
