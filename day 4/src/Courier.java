public class Courier implements WorkerInterface{
    private static int courier_salary = 80;
    private int salary;

    public Courier(int salary){
        this.salary = salary;
    }  

    public int getSalary(){
        return this.salary;
    }

    @Override
    public void doWork(Warehouse warehouse) {
        this.salary += Courier.courier_salary;
        warehouse.setCounterOrder(1);
    }

    @Override
    public void bonus(Warehouse warehouse) {
        if(warehouse.getCounterOrder() == 1500){
            this.changeSalaryByBonus(3);
        }
    }

    @Override
    public void changeSalaryByBonus(int factor) {
        Courier.courier_salary = Courier.courier_salary * factor;
    }
}
