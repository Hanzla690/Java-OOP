package Assignment2;

public class PC {
    private String name;
    private int ramSize;
    private int hardDisk;
    private String assetID;
    private static int count = 0;


    public PC(String name, int ramSize, int hardDisk, String assetID) {
        this.name = name;
        this.ramSize = ramSize * 1024;
        this.hardDisk = hardDisk;
        this.assetID = assetID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getassetID() {
        return assetID;
    }

    public void setassetID(String assetID) {
        this.assetID = assetID;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount() {
        PC.count = count + 1;
    }
}
