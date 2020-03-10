package com.company;

public class EmailExampleTest {
    public static final String[] validEmail = new String[] {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[] {"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        EmailExample emailExample = new EmailExample();
        for (String email:validEmail){
            boolean invalid = emailExample.validate(email);
            System.out.println("Email is" + email + "is valid: " + invalid);
        }
        for (String email : invalidEmail){
            boolean invalid = emailExample.validate(email);
            System.out.println("Email is" + email + "is valid:" + invalid);
        }
    }
}
