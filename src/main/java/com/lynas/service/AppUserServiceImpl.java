package com.lynas.service;

import com.lynas.model.AppUser;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppUserServiceImpl implements AppUserService {
    @Override
    public AppUser findById(Long id) {
        return getAppUserList().stream().filter(appUser -> appUser.getId().equals(id)).findFirst().get();
    }

    public List<AppUser> getAppUserList() {
        AppUser appUser1 = new AppUser(1L, "Max1");
        AppUser appUser2 = new AppUser(2L, "Max2");
        AppUser appUser3 = new AppUser(3L, "Max3");
        AppUser appUser4 = new AppUser(4L, "Max4");

        List<AppUser> appUserList = new ArrayList<>();
        appUserList.add(appUser1);
        appUserList.add(appUser2);
        appUserList.add(appUser3);
        appUserList.add(appUser4);
        return appUserList;
    }
}
