package BehaviourPatterns.Command.visitor;

public class Taxi {
//    void handleCustomer(Customer customer) {
//        if(customer instanceof RichCustomer) {
//            System.out.println("Płacisz 120");
//        } else if(customer instanceof PoorCustomer) {
//            System.out.println("Płac 300");
//        }
//    }
    void handleCustomer(PoorCustomer customer) {
        System.out.println("płać 300");
    }
    void handleCustomer(RichCustomer customer) {
        System.out.println("Płać 10");
    }

}
