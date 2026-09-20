public class OmenHP extends Computer{
    public OmenHP(String name, int memory_size) {
        super(name, memory_size);
    }

    public void setName(String name, int memory_size) {
        super.setName(name);
        this.memory_size = memory_size;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
