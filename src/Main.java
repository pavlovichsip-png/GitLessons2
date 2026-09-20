public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Asus", 200_000);
        OmenHP omenHP = new OmenHP("OmenHP", 240_000);
        omenHP.setName("Acer", 8_000);
        System.out.println(omenHP.memory_size);
        System.out.println(omenHP.name);
        SaveComputer saveComputer = new SaveComputer();
        saveComputer.save(computer);
    }
}