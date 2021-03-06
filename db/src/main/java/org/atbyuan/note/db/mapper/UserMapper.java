package org.atbyuan.note.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.atbyuan.note.common.entity.User;

/**
 * @author atbyuan
 * @date 2021/8/1 15:54
 **/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
