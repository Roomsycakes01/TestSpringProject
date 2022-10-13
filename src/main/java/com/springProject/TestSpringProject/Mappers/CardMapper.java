/*
 * Copyright 2022 WANdisco
 */
package com.springProject.TestSpringProject.Mappers;

import com.springProject.TestSpringProject.Mappers.Card;
import com.springProject.TestSpringProject.Mappers.CardDTO;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;


@Mapper(componentModel = "spring")
public interface CardMapper
{
    @Mapping(target = "numberRank", source = "numericalRank")
    @Mapping(target = "colour", ignore = true )
    CardDTO cardToCardDTO(Card card);

    @AfterMapping
    default void setColour(Card card, @MappingTarget CardDTO cardDTO) {
        String cardSuit = card.getSuit();
        String colour = "Black";
        if (cardSuit.equalsIgnoreCase("diamonds") || cardSuit.equalsIgnoreCase("hearts")) {
            colour = "Red";
        }
        cardDTO.setColour(colour);
    }
}
