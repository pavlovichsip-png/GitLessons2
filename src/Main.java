public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Acer", 200_000);
        SaveComputer saveComputer = new SaveComputer();
        saveComputer.save(computer);
        LoadComputer loadComputer = new LoadComputer();
        loadComputer.load(computer);
    }
}