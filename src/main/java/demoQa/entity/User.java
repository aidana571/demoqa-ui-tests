package demoQa.entity;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@EqualsAndHashCode
public class User {

    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;


}
