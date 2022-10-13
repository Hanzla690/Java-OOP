public class Driver {

    private static Person list[] = new Person[10];
    
    public static void main(String[] args) {
        for(int i = 0; i < list.length;i++){
            list[i] = new Person("Hanzla", "Khan", new Date(20, 12, 2002));
        }

        displayList(list);
        countPerson(list);
    }

    public static void displayList(Person list[]){
           for(int i = 0; i < list.length;i++){
                if(list[i]!= null){
                    System.out.println("Name: "+list[i].getFirstName()+" "+list[i].getLastname()+"    "+
                    "Date of Birth: "+list[i].getDob());
                }  
           } 
    }

    public static void countPerson(Person list[]){
        int count = 0;
        for(int i = 0; i<list.length;i++){
            if(list[i]!= null){
                count++;
            }
        }
        System.out.println("The number of Persons currently present are :"+count);
    }
}
