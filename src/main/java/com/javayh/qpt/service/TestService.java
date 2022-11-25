package com.javayh.qpt.service;

import com.javayh.qpt.entity.SysUserEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * <p>
 *
 * </p>
 *
 * @author hai ji
 * @version 1.0.0
 * @since 2022-11-24
 */
@Service
public class TestService {

    private final List<SysUserEntity> userCache = new ArrayList<>();

    public List<SysUserEntity> findAll() {
        if (CollectionUtils.isEmpty(userCache)) {
            for (int i = 1; i <= 10; i++) {
                userCache.add(new SysUserEntity(i, UUID.randomUUID().toString(), UUID.randomUUID().toString()));
            }
        }
        return userCache;
    }
}
