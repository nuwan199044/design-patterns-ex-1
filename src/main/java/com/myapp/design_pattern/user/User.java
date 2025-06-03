package com.myapp.design_pattern.user;

public class User {
    // required parameters
    private final String firstName;
    private final String lastName;

    // optional parameters
    private final int age;
    private final String email;
    private final String phone;

    // private constructor
    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    // Static nested builder class
    public static class UserBuilder {
        private final String firstName;
        private final String lastName;

        private int age = 0;
        private String email = "";
        private String phone = "";

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    // Just for testing purposes
    @Override
    public String toString() {
        return String.format("User [firstName=%s, lastName=%s, age=%d, email=%s, phone=%s]",
                firstName, lastName, age, email, phone);
    }
}
