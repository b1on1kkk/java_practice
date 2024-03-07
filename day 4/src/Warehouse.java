public class Warehouse {
    private int countOrder;
    private int balance;

    public Warehouse(int countOrder, int balance){

    }

    public int getCounterOrder(){
        return this.countOrder;
    }

    public void setCounterOrder(int value){
        this.countOrder += value;
    }

    public int getBalance(){
        return this.balance;
    }

    public void setBalance(int value){
        this.balance += value;
    }

    @Override
    public String toString() {
        return "countOrder: " + this.countOrder + " balance: " + this.balance;
    }

}

