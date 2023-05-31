package problem_one;

public class Main {
    public static void main(String[] args) {
        Customer[] customers = new Customer[3];
        int indexCount = 0;

        Customer customerOne = new Customer("Joe", "Smith", "332-221-4444");
        Address addressOne = new Address("Testing Stree One", "Chicago", "Illinois", "1234");
        customerOne.setBillingAddress(addressOne);
        customerOne.setShippingAddress((addressOne));
        customers[indexCount++] = customerOne;

        Customer customerTwo = new Customer("Ben", "Mar", "332-221-5555");
        Address addressTwo = new Address("Testing Stree Two", "Springfield", "Illinois", "1243");
        customerTwo.setBillingAddress(addressTwo);
        customerTwo.setShippingAddress((addressTwo));
        customers[indexCount++] = customerTwo;

        Customer customerThree = new Customer("Kash", "Subedi", "332-221-6666");
        Address addressThree = new Address("Testing Stree Three", "Fairfield", "Iowa", "6543");
        customerThree.setBillingAddress(addressThree);
        customerThree.setShippingAddress((addressThree));
        customers[indexCount++] = customerThree;

        for (Customer eachCustomer : customers) {
            if (eachCustomer.getBillingAddress().getCity().equals("Chicago")) {
                System.out.println(eachCustomer);
            }
        }
    }
}