package randomValuesForTests;
import com.github.javafaker.Faker;

public class fakeData {
    Faker faker = new Faker();

    public String fullName = faker.name().fullName();
    public String userNumber = faker.number().digits(10);
    public String email = faker.internet().emailAddress();
    public String randomCareer = faker.options().option("Разработка", "Тестирование",
            "Системный / Бизнес Анализ", "Работа с персоналом", "Дизайн", "Управление проектами");

}
