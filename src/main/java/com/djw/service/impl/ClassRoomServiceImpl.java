package com.djw.service.impl;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.djw.entity.ClassRoom;
import com.djw.mapper.ClassRoomMapper;
import com.djw.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 
 *
 * @author dz
 * @date 2023-05-23
 */
@Service
public class ClassRoomServiceImpl extends ServiceImpl<ClassRoomMapper, ClassRoom> implements ClassRoomService {
    @Autowired
    private ClassRoomMapper classRoomMapper;


    @Override
    public List<ClassRoom> list() {

        LambdaQueryWrapper wrapper = new LambdaQueryWrapper();
        List<ClassRoom> list = classRoomMapper.selectList(wrapper);

        return list;
    }
}
