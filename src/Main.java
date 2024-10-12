import kg.Barsbek.Homework5.Boss;
import kg.Barsbek.Homework5.Hero;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра Босса
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(70);
        boss.setDefenseType("Защита от магии");

        // Печать информации о боссе
        System.out.println("Информация о боссе:");
        System.out.println("Здоровье: " + boss.getHealth());
        System.out.println("Урон: " + boss.getDamage());
        System.out.println("Тип защиты: " + boss.getDefenseType());

        // Создание героев и печать их информации
        Hero[] heroes = createHeroes();
        System.out.println("\nИнформация о героях:");
        for (Hero hero : heroes) {
            System.out.println("Здоровье: " + hero.getHealth() +
                    ", Урон: " + hero.getDamage() +
                    ", Суперспособность: " + hero.getSuperAbility());
        }
    }

    // Метод создания героев
    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(100, 20, "Супер скорость");
        Hero hero2 = new Hero(120, 25); // Использует второй конструктор
        Hero hero3 = new Hero(150, 30, "Невидимость");

        return new Hero[]{hero1, hero2, hero3};
    }
}
