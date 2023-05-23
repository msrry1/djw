package com.djw.controller;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.djw.entity.ClassRoom;
import com.djw.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName: ClassRoomController
 * Package: com.zsxb.controller
 * Description:
 *
 * @Author lyh
 * @Create 2023/5/22 20:43
 * @Version 1.0
 */
@RestController
@RequestMapping("/room")
public class ClassRoomController {

    @Autowired
    private ClassRoomService classRoomService;

    /**
     * 查询所有教室
     * @return
     */
    @GetMapping("/list")
    public List<ClassRoom> list() {

        List<ClassRoom> list =  classRoomService.list();
        return list;
    }


    @PostMapping("/update")
    public String update(@RequestBody ClassRoom classRoom) {
        if (classRoom.getId() == null) {
            classRoomService.save(classRoom);
            return "添加成功";
        } else {
            classRoomService.updateById(classRoom);
            return "修改成功";
        }
    }

    @PostMapping("/delete/{id}")
    public int delete(@PathVariable Integer id) {
        classRoomService.removeById(id);
        return 1;
    }

    @GetMapping("/query/{roomNumber}")
    public List<ClassRoom> query(@PathVariable String roomNumber) {
        LambdaQueryWrapper<ClassRoom> classRoomLambdaQueryWrapper = new LambdaQueryWrapper<>();
        classRoomLambdaQueryWrapper.eq(ClassRoom::getRoomNumber, roomNumber);
        List<ClassRoom> list = classRoomService.list(classRoomLambdaQueryWrapper);
        return list;
    }


}
