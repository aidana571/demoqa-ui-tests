package demoQa.page;

import demoQa.enums.Role;

import static demoQa.enums.Role.ADMINISTRATOR;

public class Component extends BasePage {

    public static void selectRole(Role role){
        role.getRole();
    }

    public static void main(String[] args) {
        selectRole(ADMINISTRATOR);
    }
}
