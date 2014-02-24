import java.util.Arrays;
import java.util.List;

/**
 * Created by rcapraro on 24/02/2014.
 */
public class PersonsDB {

    public final static List<Person> PERSONSDB;

    public static final Person JOHN_DOE;
    public static final Person JAMES_DOE;
    public static final Person JOHN_CAKE;
    public static final Person JAMES_DRUFF;
    public static final Person DAN_SMITH;
    public static final Person LEN_SMITH;

    static {

        JOHN_DOE = new Person("John", "Doe", 30);
        JAMES_DOE = new Person("James", "Doe", 20);
        JOHN_CAKE = new Person("John", "Cake", 40);
        JAMES_DRUFF = new Person("Mike", "Druff", 30);
        DAN_SMITH = new Person("Dan", "Smith", 20);
        LEN_SMITH = new Person("Len", "Smith", 40);

        PERSONSDB = Arrays.asList(new Person[]{JOHN_DOE, JAMES_DOE, JOHN_CAKE, JAMES_DRUFF, DAN_SMITH, LEN_SMITH});
    }
}
