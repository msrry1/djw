package com.djw.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.djw.entity.ClassRoom;

import java.util.List;

/**
 * 
 *
 * @author dz
 * @date 2023-05-23
 */
public interface ClassRoomService extends IService<ClassRoom> {
    List<ClassRoom> list();

}
