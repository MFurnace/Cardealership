public abstract class Departments {
    private String deptName;
    private int numEmployees;


    public Departments(){
        this.deptName = "Generic";
        this.numEmployees = 0;
    }
    
    public Departments(String name, int numEmployees){
        this.deptName = name;
        this.numEmployees = numEmployees;
    }

    public static void printIsOpen(List<Departments> depts, LocalDateTime today){
        //Cycle through each department in provided List
        for (Departments d: depts){
            //Prints out name of Depts and return if that Dept is open today
            System.out.println(d.toString() + " is open today?" + d.isOpenToday
            (today));
            //use instanceof keyword to test is itemm in List is
            //of a certain object or data type
            if (d instanceof ServiceDepartment){
                System.out.println(d.toString() + "only closes on Sundays.");
            }
        }
    }

    public abstract boolean isOpenToday(LocalDateTime day);

    @Override
    public String toString(){
        return this.deptName + "Department";
    }
}