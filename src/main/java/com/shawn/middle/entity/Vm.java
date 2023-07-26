package com.shawn.middle.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("finalrealazurawsdb")
public class Vm {
    @TableField(value = "id_vm")
    private String idVm;
    @TableField(value = "cpu_vm")
    private String cpu;
    @TableField(value = "memory_vm")
    private String memory;
    @TableField(value = "hourrate_vm")
    private String hourrate;
    @TableField(value = "location_vm")
    private String location;
    @TableField(value = "csp_vm")
    private String csp;

    // 默认构造函数
    public Vm() {
    }

    // 带参数的构造函数
    public Vm(String id_vm, String cpu, String memory, String hourrate, String location, String csp) {
        this.idVm = id_vm;
        this.cpu = cpu;
        this.memory = memory;
        this.hourrate = hourrate;
        this.location = location;
        this.csp = csp;
    }

    public String getId() {
        return idVm;
    }

    public void setId_vm(String id_vm) {
        this.idVm = id_vm;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getHourrate() {
        return hourrate;
    }

    public void setHourrate(String hourrate) {
        this.hourrate = hourrate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCsp() {
        return csp;
    }

    public void setCsp(String csp) {
        this.csp = csp;
    }

    @Override
    public String toString() {
        return "Vm{" +
                "id='" + idVm + '\'' +
                ", cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", hourrate='" + hourrate + '\'' +
                ", location='" + location + '\'' +
                ", csp='" + csp + '\'' +
                '}';
    }
}
