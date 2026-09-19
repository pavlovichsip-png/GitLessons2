public class LoadComputer implements ILoad{
    @Override
    public void load(Computer computer) {
        System.out.println("Загрузка объекта их файла: " + computer);
    }
}