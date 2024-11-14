package com.api.learning.mapper;

import com.api.learning.model.entity.UserEntity;
import com.api.learning.model.view.UserView;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    // Phương thức chuyển đổi từ UserEntity sang UserView
    public UserView toView(UserEntity userEntity) {
        UserView userView = new UserView();
        userView.setId(userEntity.getId());
        userView.setEmail(userEntity.getEmail());
        userView.setFirstName(userEntity.getFirstName());
        userView.setLastName(userEntity.getLastName());
        userView.setFullName(userEntity.getFullName());
        userView.setPhoneNumber(userEntity.getPhoneNumber());
        userView.setDateOfBirth(userEntity.getDateOfBirth());
        return userView;
    }

    // (Tùy chọn) Phương thức chuyển đổi từ UserView sang UserEntity nếu cần
    public UserEntity toEntity(UserView userView) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userView.getId());
        userEntity.setEmail(userView.getEmail());
        userEntity.setFirstName(userView.getFirstName());
        userEntity.setLastName(userView.getLastName());
        userEntity.setFullName(userView.getFullName());
        userEntity.setPhoneNumber(userView.getPhoneNumber());
        userEntity.setDateOfBirth(userView.getDateOfBirth());
        return userEntity;
    }
}