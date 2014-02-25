import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

import static org.junit.Assert.assertEquals;

/**
 * Created by rcapraro on 25/02/2014.
 */
public class DateAndTimeTest {

    @Test
    public void testDateAndTime() {

        LocalDate today = LocalDate.now(); //LocalDate est une date sans fuseau horaire
        LocalDate payDay = today.with(TemporalAdjusters.lastDayOfMonth());

        LocalDate ticketsDay = payDay.minusDays(2);

        Period p1 = Period.between(ticketsDay, payDay);
        long p2 = ChronoUnit.DAYS.between(ticketsDay, payDay);
        assertEquals(2, p1.getDays());
        assertEquals(2, p2);


        LocalDate dateOfBirth = LocalDate.of(1974, Month.OCTOBER, 10);
        LocalDate firstBirthday = dateOfBirth.plusYears(1);
        assertEquals(firstBirthday.getYear(), 1975);

    }

}
