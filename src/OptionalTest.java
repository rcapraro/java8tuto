import junit.framework.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

/**
 * Created by rcapraro on 09/03/2014.
 */
public class OptionalTest {

    @Test
    public void testOptional() {

        Optional<Person> mrCake = findByLastName("Cake", PersonsDB.PERSONSDB);

        Assert.assertNotNull(mrCake.orElse(null));

        Optional<Person> mrFruit = findByLastName("Fruit", PersonsDB.PERSONSDB);

        Assert.assertNull(mrFruit.orElse(null));

    }

    public Optional<Person> findByLastName(String lastName, List<Person> persons) {

        for (Person person : persons) {
            if (person.getLastName().equals(lastName)) {
                return Optional.of(person);
            }
        }
        return Optional.empty();

    }

}
