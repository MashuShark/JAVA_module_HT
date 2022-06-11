package HT8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;

public class Client implements Iterator<Deposit> {

    private Deposit[] deposits;

    public Client() {
        this.deposits = new Deposit[10];
    }

    public Deposit[] getDeposits() {
        return deposits;
    }

//    public void setDeposits(int i, Deposit deposit) {
//        this.deposits[i] = deposit;
//    }

    public Deposit getDeposit(int i) {
        return this.deposits[i];
    }

    public boolean AddDeposit(Deposit deposit) {
        for (int i = 0; i < 10; ++i) {
            if (getDeposit(i) == null) {
                //setDeposits(i, deposit);
                this.deposits[i] = deposit;
                return true;
            }
        }
        return false;
    }

    public BigDecimal TotalIncome() {
        BigDecimal count = new BigDecimal(0);
        for (int i = 0; i < 10; ++i) {
            if (getDeposit(i) != null)
                count = count.add(GetIncomeByNumber(i));
        }
        return count;
    }

    public BigDecimal MaxIncome () {
        BigDecimal temp = new BigDecimal(0);
        for (int i = 0; i < 10; ++i) {
            if (GetIncomeByNumber(i).compareTo(temp) == 1) {
                temp = GetIncomeByNumber(i);
            }
        }
        return temp;
    }

    public BigDecimal GetIncomeByNumber (int number){
        if (getDeposit(number) == null )
            return new BigDecimal(0);
        return getDeposit(number).Income();
    }

    public int countPossibleToProlongDeposit(){
        int count = 0;
        for (int i = 0; i < 10; ++i) {
            if (getDeposit(i) instanceof Prolongable){
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "Client{" +
                "deposits=" + Arrays.toString(deposits) +
                '}';
    }

    // A utility function to swap two elements
    public void swap(Client client, int i, int j ){
        Deposit temp = getDeposit(i);
        this.deposits[i] = deposits[j];
        this.deposits[j] = temp;
    }

    /* This function takes last element as pivot, places
   the pivot element at its correct position in sorted
   array, and places all smaller (smaller than pivot)
   to left of pivot and all greater elements to right
   of pivot */
    public int partition(Client client, int low, int high){

        // pivot
        BigDecimal pivot = GetIncomeByNumber(high);

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++) {

            // If current element is smaller
            // than the pivot
            if (GetIncomeByNumber(j).compareTo(pivot) == 1){

                // Increment index of
                // smaller element
                i++;
                swap(client, i, j);
            }
        }
        swap(client, i + 1, high);
        return i + 1;
    }

    public void quickSort(Client client, int low, int high) {

        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(client, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(client, low, pi-1);
            quickSort(client, pi + 1, high);
        }

    }
class Node<Deposit> {
    Deposit data;
    Node<Deposit> next;

    public Node(){
    data = null;
    next = null;
    }
    public Node(Deposit data) {
        this.data = data;
        }
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Deposit next() {
        return null;
    }

}
