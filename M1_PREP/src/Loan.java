import static java.lang.Math.round;

public class Loan {
    int max_loan=0;
    int total_loan=0;
    int clients;
    int[] loans;
    int size=0;
    public double Average(){
        return round(((double) total_loan/ (double) size)*100.0)/100.0;
    }
    public void assignLoan(int[] new_loan){
        for (int i=0;i<new_loan.length;i++){
            if (size >= clients){
                break;
            }
            total_loan += new_loan[i];
            loans[size] = new_loan[i];
            max_loan = Math.max(max_loan,new_loan[i]);
            size++;
        }
    }
    int maxLoan(){
        return  max_loan;
    }
    public Loan(int clients){
        this.clients = clients;
        loans = new int[clients];
    }

    public static void main(String[] args) {
        Loan loan = new Loan(4);
        int[] new_loan = {400,500,700};
        loan.assignLoan(new_loan);
        System.out.println(loan.maxLoan());
        System.out.printf("%.2f",loan.Average());
        System.out.println();
        int[] new_loan1 = {1000,2020,3000};
        loan.assignLoan(new_loan1);
        System.out.println(loan.maxLoan());
        System.out.printf("%.2f",loan.Average());

    }
}
