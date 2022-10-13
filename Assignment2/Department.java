package Assignment2;

public class Department {
    private String labName;
    private Employee HOD;
    private int labCount;
    private Lab[] labs;

    public Department(String name, Employee HOD, int labCount) {
        this.labName = name;
        this.HOD = HOD;
        this.labCount = labCount;
        this.labs = new Lab[this.labCount];
    }

    public void createLab(String name, int noOfComputers, String empName, String empDesignation){
        String checkString ="";
        for(int i=0;i<=Lab.getCount();i++){
            if(labs[i]!=null){
                checkString = labs[i].getLabName();
                if(checkString.equals(name)){
                    System.out.printf("%nLab %s already exists!", name);
                    break;
                }
            }else{
                labs[Lab.getCount()] = new Lab(name, noOfComputers, new Employee(empName, empDesignation));
                Lab.setCount();
                break;
            } 
        }     
    }

    public void displayLabInfo(){
        if(Lab.getCount() == 0){
            System.out.println("No labs present, create some labs first");
        }else{
            for(int i=0;i<labs.length;i++){
                if(labs[i]!=null){
                    System.out.printf("Lab Name: %s%nLab Attendant: %s%nNo. of Computers: %d%n%n",labs[i].getLabName(),labs[i].getLabAttendant(),labs[i].getComputerCount());
                }
            }System.out.printf("To create PCs in a lab specify its name and then PCs can be created inside that lab!%n");
        }   
    }

    public Lab[] getLabs() {
        return labs;
    }
}
