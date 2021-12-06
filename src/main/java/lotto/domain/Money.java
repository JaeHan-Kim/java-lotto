package lotto.domain;

import java.util.Objects;

public class Money {
    private final int value;

    public Money(final String value) {
        this(Integer.parseInt(value));
    }

    public Money(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Money minus(int manualLottoPrice) {
        return new Money(this.value - manualLottoPrice);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return value == money.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
