package lowLevelDesign.designPatterns.builder;

public class CustomerMessage {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    private CustomerMessage(CustomerMessageBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
    }

    public static class CustomerMessageBuilder {

        private String firstName;
        private String lastName;
        private String phoneNumber;
        private String email;

        CustomerMessageBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        CustomerMessageBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        CustomerMessageBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        CustomerMessageBuilder email(String email) {
            this.email = email;
            return this;
        }

        CustomerMessage build() {
            return new CustomerMessage(this);
        }
    }

    @Override
    public String toString() {
        return "CustomerMessage{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
