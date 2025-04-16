package demoQa.enums;

import lombok.Getter;

public enum Role {
    ADMINISTRATOR("Administrator"),
    INSTRUCTOR("Instructor"),
    LEARNER("Learner"),
    ;

    @Getter
    String role;


     Role (String role){
        this.role = role;
    }
}
