package kaiquebt.dev.telemanager.model;

public enum RoleType {
    ROLE_USER,
    ROLE_ADMIN;
    
    @Override
    public String toString() {
        return name();
    }
}