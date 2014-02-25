import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.matchers.JUnitMatchers.hasItem;

/**
 * Created by rcapraro on 24/02/2014.
 */
public class PersonTest {

    @Test
    public void getPersonsByAgeTest() {

        final List<Person> personnesDe30ans = PersonsDB.PERSONSDB.stream()
                .filter((person) -> person.getAge() == 30)
                .collect(Collectors.toList());

        Assert.assertThat(personnesDe30ans, hasItem(PersonsDB.JOHN_DOE));
    }

    @Test
    public void sumOfAgesTest() {

        final int sommeDesAges = PersonsDB.PERSONSDB.stream()
                .filter((person) -> person.getFirstName().startsWith("John"))
                .map((person) -> person.getAge())
                .reduce(0, (x,y) -> x+y);

        Assert.assertThat(sommeDesAges, equalTo(70));
    }

}
