public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Acer", 200_000);
        OmenHP omenHP = new OmenHP("OmenHP", 240_000);
        omenHP.setName("Honor", 8_000);
        System.out.println(omenHP.memory_size);
        System.out.println(omenHP.name);
        SaveComputer saveComputer = new SaveComputer();
        saveComputer.save(computer);
        LoadComputer loadComputer = new LoadComputer();
        loadComputer.load(computer);
        System.out.println("jfjffj");
    }
}