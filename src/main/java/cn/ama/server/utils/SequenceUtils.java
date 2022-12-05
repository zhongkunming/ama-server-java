package cn.ama.server.utils;

import cn.ama.server.entity.SysSequence;
import cn.ama.server.mapper.SysSequenceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SequenceUtils {

    private static SysSequenceMapper sysSequenceMapper;

    @Autowired
    public void setSysSequenceMapper(SysSequenceMapper sysSequenceMapper) {
        SequenceUtils.sysSequenceMapper = sysSequenceMapper;
    }

    public static String getSeq(String sequenceName) {
        SysSequence sequence = sysSequenceMapper.queryBySequenceName(sequenceName);
        sysSequenceMapper.updateBySequenceName(sequenceName);
        return String.valueOf(sequence.getCurrentVal());
    }


}
