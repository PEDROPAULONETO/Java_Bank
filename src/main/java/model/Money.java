package model;

import java.util.ArrayList;
import java.util.List;

public class Money {

    private final List<MoneyAudit> history = new ArrayList<>();

    public Money(final MoneyAudit history) {
        this.history.add(history);
    }

    public void addHistory(final MoneyAudit history){
        this.history.add(history);
    }

    public List<MoneyAudit> getHistory(){
        return this.history;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return history.equals(money.history);
    }

    @Override
    public int hashCode() {
        return history.hashCode();
    }

    @Override
    public String toString() {
        return "Money{" +
                "history=" + history +
                '}';
    }
}