public class Dealership {
    public static void main(String[] args) {

        //Instantiates new object for each Department
        ServiceDepartment sd = new ServiceDepartment();
        FinanceDept fd = new FinanceDept();
        SalesDept sales = new SalesDept();

        //Add our departments to a list
        List<Departments> depts = new ArrayList<>();
        depts.add(sd);
        depts.add(fd);
        depts.add(sales);

        Departments.printIsOpen(depts, LocalDateTime.now());
    }
}