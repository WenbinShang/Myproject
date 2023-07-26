package com.shawn.middle.entity;

import java.util.List;

public class VmDto {
    private String id_vm;
    private String cpu;
    private String memory;
    private String hourrate;
    private String location;
    private String csp;
    private String processingtime;
    private List<String> links;

    // 添加所有getter和setter

    public VmDto() {
    }

    public VmDto(String id_vm, String cpu, String memory, String hourrate, String location, String csp, String processingtime, List<String> links) {
        this.id_vm = id_vm;
        this.cpu = cpu;
        this.memory = memory;
        this.hourrate = hourrate;
        this.location = location;
        this.csp = csp;
        this.processingtime = processingtime;
        this.links = links;
    }

    public String getId_vm() {
        return id_vm;
    }

    public void setId_vm(String id_vm) {
        this.id_vm = id_vm;
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

    public String getProcessingtime() {
        return processingtime;
    }

    public void setProcessingtime(String processingtime) {
        this.processingtime = processingtime;
    }

    public List<String> getLinks() {
        return links;
    }

    public void setLinks(List<String> links) {
        this.links = links;
    }
}
