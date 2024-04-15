package Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDAO {

    public List<String> isValidToInclude(Person person) {
        List<String> errors = new ArrayList<>();

        String[] nameParts = person.getName().split(" ");
        if (nameParts.length < 2 || !person.getName().matches("[a-zA-Z ]+")) {
            errors.add("Nome deve ter ao menos 2 partes e ser composto apenas por letras");
        }

        if (person.getAge() < 1 || person.getAge() > 200) {
            errors.add("Idade deve estar no intervalo [1, 200]");
        }

        if (person.getEmails().isEmpty()) {
            errors.add("Pelo menos um email deve ser associado à pessoa");
        } else {
            for (Email email : person.getEmails()) {
                if (!isValidEmailFormat(email.getName())) {
                    errors.add("Formato de email inválido");
                    break;
                }
            }
        }

        return errors;
    }

    private boolean isValidEmailFormat(String email) {
        return email.matches(".+@.+\\..+");
    }
}
