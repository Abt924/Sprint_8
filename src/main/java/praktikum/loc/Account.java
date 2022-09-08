package praktikum.loc;

public class Account {
    static final int MIN_LEN = 3;
    static final int MAX_LEN = 19;
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
            /*
                 Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
                 Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
             */
        if (name.length() < MIN_LEN || name.length() > MAX_LEN) return false;
        if (name.startsWith(" ") || name.endsWith(" ")) return false;
        if (count(name, " ") != 1) return false;
        return true;
    }

    public static int count(String str, String target) {
        return (str.length() - str.replace(target, "").length()) / target.length();
    }

}
