package ru.bemo.study.black.jack.player;

import ru.bemo.study.black.jack.deck.Card;
import ru.bemo.study.black.jack.deck.Deck;

/**
 * Класс дилера. Дилер Может давать карты из колоды.
 *
 */
public class Diller extends Player {

    private Deck cardDeck;

    /**
     * Выдать карту из колоды. Дилер в одной игре не может выдать
     * повторяющиеся карты.
     *
     * @return Карта из колоды
     */
    public Card openCard() {
        return cardDeck.getCard();
    }
}
