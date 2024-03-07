public class Picker implements WorkerInterface {
    private static int picker_salary = 100;

    private int salary;

    public Picker(int salary){
        this.salary = salary;
    }  

    public int getSalary(){
        return this.salary;
    }
    
    @Override
    public void doWork(Warehouse warehouse) {
        this.salary += Picker.picker_salary;
        warehouse.setBalance(1000);
    }

    @Override
    public void bonus(Warehouse warehouse) {
        if(warehouse.getBalance() == 1000000){
            this.changeSalaryByBonus(2);
        }   
    }

    @Override
    public void changeSalaryByBonus(int factor) {
        Picker.picker_salary = Picker.picker_salary * factor;
    }
}
