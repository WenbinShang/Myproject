package com.shawn.middle.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shawn.middle.entity.Vm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Vmmapper extends BaseMapper<Vm> {
    @Select("SELECT id_vm AS idVm, cpu_vm AS cpu, memory_vm AS memory, hourrate_vm AS hourrate, location_vm AS location, csp_vm AS csp FROM finalrealazurawsdb")
    List<Vm> selectAllVms();


}
