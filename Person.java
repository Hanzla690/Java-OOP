public class Person {

    private String name;
    private String age;
    private String cnic;
    private String cellNum;

    public Person(String name, String age, String cnic, String cellNum) {
        this.name = name;
        this.age = age;
        this.cnic = cnic;
        this.cellNum = cellNum;
    }
    public String getCellNum() {
        return cellNum;
    }

    public void setCellNum(String cellNum) {
        this.cellNum = cellNum;
    }


    public void display_info(){
        System.out.printf("Name: %s Age: %s CNIC Number: %s Cell Number: %s",name, age, cnic, cellNum);
    }
    
}
