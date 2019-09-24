package ru.job4j.Observer;

public class Player implements Observer {
    private Card card;
    Subject subject;
    Wins wins;

    public Player(Card card, Subject subject, Wins wins) {
        this.card = card;
        this.subject = subject;
        this.wins = wins;
    }

    public void update(Integer value) {
        card.checkValue(value);
        if (card.checkWin()) {
            wins.add(this);
        }
    }

    public void registerWin(Observer observer) {

    }
}
