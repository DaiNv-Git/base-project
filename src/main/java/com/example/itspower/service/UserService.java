package com.example.itspower.service;

import com.example.itspower.model.entity.UserEntity;
import com.example.itspower.response.search.AddToUserForm;

public interface UserService {
    UserEntity save(AddToUserForm userForm);

}
