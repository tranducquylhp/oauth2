package quytd.oauth2.service;

import quytd.oauth2.model.Role;

public interface RoleService {
    Role findRoleByName(String roleName);

    Iterable<Role> findAll();

    void save(Role role);
}
