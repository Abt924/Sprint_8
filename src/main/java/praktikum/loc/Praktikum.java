package praktikum.loc;

public class Praktikum {

    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом praktikum.loc.Praktikum.Account.
             Нужно создать экземпляр класса praktikum.loc.Praktikum.Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
        String name = "sdh khjh";
        Account account = new Account(name);
        System.out.println("Test name: " + name + " is valid " + account.checkNameToEmboss());

    }
}

