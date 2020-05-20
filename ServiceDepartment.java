public class ServiceDepartment extends Departments {
    //Constructor w/ deptNames and numEmployees given
    public ServiceDepartment(){
        super("Service", 20);
    }

    @Override
    public boolean isOPenToday(LocalDateTime day){
        if (day.getDayOfWeek().equals(DayOfWeek.SUNDAY)){
            return false;
        }else{
            return true;
        }
    }
}