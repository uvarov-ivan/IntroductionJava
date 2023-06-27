package LaptopLibrary;

import java.util.Objects;

public class Laptops { // Создал класс
    public int id;
    public String name;
    public double price;
    public String os;
    public String processor;
    public String typeDrive;
    public int meinMemory;
    public int operMemory;

    public Laptops(int id, String name, double price, String os, String processor, String typeDrive, int meinMemory,
            int operMemory) { // Определил класс
        this.id = id;
        this.name = name;
        this.price = price;
        this.os = os;
        this.processor = processor;
        this.typeDrive = typeDrive;
        this.meinMemory = meinMemory;
        this.operMemory = operMemory;
    }

    @Override
    public String toString() {//Переопределили формат печати эллументов класса
        return "Название = " + name + ", цена = " + price + " руб, операционная система = " + os + ", процессор = "
                + processor
                + ", вид накопителя = " + typeDrive + ", основная память = " + meinMemory + " GB, оперативная память = "
                + operMemory + " GB.";
    }

    @Override
    public int hashCode() { // Переопределили создание хэша
        return Objects.hash(id, name, os, operMemory, meinMemory);
    }

    @Override
    public boolean equals(Object obj) { // Переопределили алгоритм сравнения эллементов
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Laptops other = (Laptops) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (price != other.price)
            return false;
        if (os == null) {
            if (other.os != null)
                return false;
        } else if (!os.equals(other.os))
            return false;
        if (processor == null) {
            if (other.processor != null)
                return false;
        } else if (!processor.equals(other.processor))
            return false;
        if (typeDrive == null) {
            if (other.typeDrive != null)
                return false;
        } else if (!typeDrive.equals(other.typeDrive))
            return false;
        if (meinMemory != other.meinMemory)
            return false;
        if (operMemory != other.operMemory)
            return false;
        return true;
    }

}