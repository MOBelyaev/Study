package ru.bemo.study.black.jack.player;

import ru.bemo.study.black.jack.deck.Card;

import java.util.ArrayList;
import java.util.List;

/**
 * Базовый класс участника игры.
 *
 */
public class Player {

    private int scores = 0;
    private final List<Card> cardsOnHand = new ArrayList<>();

    /**
     * Взять карту на руки
     *
     * @param card Карта из колоды
     */
    public void takeCard(Card card) {
        cardsOnHand.add(card);
        this.scores += calculateScores(card);
    }

    /**
     * Метод для расчёта очков, которые даёт полученная карта.
     *
     * @param card Карта выданная на руки
     * @return Очки, которые даёт эта карта
     */
    private int calculateScores(Card card) {
        String rank = card.rank();

        if(rank.equals("Ace")) {
            return (this.scores + 11 < 21) ? 11 : 1;
        }
        else {
            if (rank.equals("Queen") || rank.equals("Jack") || rank.equals("King")) {
                return 10;
            } else {
                return Integer.parseInt(rank);
            }
        }
    }

    public int scores() {
        return scores;
    }

    /**
     * Возвращает список карт на руках.
     *
     */
    public String showCardsOnHand() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < cardsOnHand.size(); i++) {
            Card card = cardsOnHand.get(i);
            builder.append(card.finalCard());
            if(i != cardsOnHand.size() - 1) {
                builder.append(", ");
            }
        }
        return builder.toString();
    }
}
