public class SalesDept extends Departments{
    public SalesDept(){
        super("Sales", 50);
    }

    @Override
    public boolean isOpenToday(LocalDateTime day){
        //Return true because SalesDept is open 7 days a week
            return true;
        }
    }

