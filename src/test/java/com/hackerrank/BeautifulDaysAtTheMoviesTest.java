package com.hackerrank;

import org.junit.Test;

import static com.hackerrank.BeautifulDaysAtTheMovies.countBeautiful;
import static com.hackerrank.BeautifulDaysAtTheMovies.isBeautiful;
import static com.hackerrank.BeautifulDaysAtTheMovies.reversed;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class BeautifulDaysAtTheMoviesTest {

    @Test
    public void shouldReverse() {
        assertThat(reversed(123)).isEqualTo(321);
        assertThat(reversed(120)).isEqualTo(21);
    }

    @Test
    public void shouldBeBeautiful() {
        assertThat(isBeautiful(20, 6)).isTrue();
        assertThat(isBeautiful(22, 6)).isTrue();
    }

    @Test
    public void shouldNotBeBeautiful() {
        assertThat(isBeautiful(21, 6)).isFalse();
        assertThat(isBeautiful(23, 6)).isFalse();
    }

    @Test
    public void shouldCountBeautiful() {
        assertThat(countBeautiful(20, 23, 6)).isEqualTo(2);
    }
}
