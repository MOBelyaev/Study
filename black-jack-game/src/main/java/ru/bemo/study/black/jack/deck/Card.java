package ru.bemo.study.black.jack.deck;

/**
 * Класс карты. Подумай, насчёт реализации rank и suit через Enum типы.
 *
 */
public class Card {
    private final static String[] rank = {"Ace", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King"};
    private final static String[] suit = {"clubs", "diamonds", "hearts", "spades"};

    private final int rankIndex;
    private final int suitIndex;

    /**
     * Создать карту
     *
     * @param rankIndex класс карты, число от 0 до 12
     * @param suitIndex масть карты, число от 0 до 3
     */
    public Card(int rankIndex, int suitIndex) {
        this.rankIndex = rankIndex;
        this.suitIndex = suitIndex;
    }

    /**
     * Строковое представление класса карты.
     *
     * @return Возвращает '2'-'10', 'Jack', 'Queen', 'King' или 'Ace'
     */
    public String rank() {
        return rank[this.rankIndex];
    }

    /**
     * Строковое представление масти карты.
     *
     * @return Возвращает 'clubs', 'diamonds', 'hearts' или 'spades'
     */
    public String suit() {
        return suit[this.suitIndex];
    }

    public String finalCard() {
        return rank() + " of " + suit();
    }
}
