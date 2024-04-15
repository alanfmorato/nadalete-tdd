package Person;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class PersonDAOTest {

    private PersonDAO personDAO;

    @Before
    public void setUp() {
        personDAO = new PersonDAO();
    }

    @Test
    public void testIsValidToInclude_InvalidName() {
        Person person = new Person(1, "John", 25);
        List<String> errors = personDAO.isValidToInclude(person);
        assertTrue(errors.contains("Nome deve ter ao menos 2 partes e ser composto apenas por letras"));
    }

    @Test
    public void testIsValidToInclude_InvalidAge() {
        Person person = new Person(1, "John Doe", 0);
        List<String> errors = personDAO.isValidToInclude(person);
        assertTrue(errors.contains("Idade deve estar no intervalo [1, 200]"));
    }

    @Test
    public void testIsValidToInclude_NoEmail() {
        Person person = new Person(1, "John Doe", 25);
        List<String> errors = personDAO.isValidToInclude(person);
        assertTrue(errors.contains("Pelo menos um email deve ser associado à pessoa"));
    }

    @Test
    public void testIsValidToInclude_InvalidEmail() {
        Person person = new Person(1, "John Doe", 25);
        person.addEmail(new Email(1, "invalidemail.com"));
        List<String> errors = personDAO.isValidToInclude(person);
        assertTrue(errors.contains("Formato de email inválido"));
    }
}
