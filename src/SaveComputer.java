public class SaveComputer implements ISave{
    @Override
    public void save(Computer computer) {
        System.out.println("Сохранение в объекта в файл: " + computer);
    }
}