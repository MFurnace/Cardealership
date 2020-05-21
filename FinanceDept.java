public class FinanceDept extends Departments {
    public FinanceDept(){
        super("Finance", 10);
    }

@Override
    public boolean isOpenToday(LocalDateTime day){
        //Return false if it ist Sat or Sun
        //SUNDAY is example of ENUM
        if (day.getDayOfWeek().equals(DayOfWeek.SUNDAY) || day.getDayOfWeek()
        .equals(DayOfWeek.SATURDAY)){
            return false;
        }else{
            return true;
        }
    }