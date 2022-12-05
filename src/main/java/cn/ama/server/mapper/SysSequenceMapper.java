package cn.ama.server.mapper;

import cn.ama.server.entity.SysSequence;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysSequenceMapper extends BaseMapper<SysSequence> {
    SysSequence queryBySequenceName(@Param("sequenceName") String sequenceName);

    void updateBySequenceName(@Param("sequenceName") String sequenceName);
}