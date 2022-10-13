package Assignment2;

public class Lab {
    private String labName;
    private int computerCount;
    private Employee labAttendant;
    public PC[] computers;
    private static int count = 0;

    public Lab(String labName, int computerCount, Employee labAttendant) {
        this.labName = labName;
        this.computerCount = computerCount;
        this.labAttendant = labAttendant;
        this.computers = new PC[this.computerCount];
    } 

    public void createPC(String name, int ram, int hdd, String num){
        computers[count++] = new PC(name, ram, hdd, num);
    }

    public void displayPCInfo(){
        for(int i = 0;i<computers.length;i++){
            if(computers[i] != null){
                System.out.printf("Computer name: %s%nComputer Ram: %sMB%nComputer Disk Space: %sGB%nComputer Number: %s%n%n",computers[i].getName(),computers[i].getRamSize(),computers[i].getHardDisk(),computers[i].getassetID());
            }
        }
    }

    public String getLabName() {
        return labName;
    }

    public int getComputerCount() {
        return computerCount;
    }

    public String getLabAttendant() {
        return labAttendant.getName();
    }

    public PC[] getComputers() {
        return computers;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount() {
        Lab.count = count + 1;
    }
}
