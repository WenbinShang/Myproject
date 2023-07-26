package com.shawn.middle.entity;

import java.util.List;

public class VmResponse {
    private double total_node_cost;
    private double total_link_cost;
    private List<VmDto> vms;

    // 添加所有getter和setter


    public double getTotal_node_cost() {
        return total_node_cost;
    }

    public void setTotal_node_cost(double total_node_cost) {
        this.total_node_cost = total_node_cost;
    }

    public double getTotal_link_cost() {
        return total_link_cost;
    }

    public void setTotal_link_cost(double total_link_cost) {
        this.total_link_cost = total_link_cost;
    }

    public List<VmDto> getVms() {
        return vms;
    }

    public void setVms(List<VmDto> vms) {
        this.vms = vms;
    }
}

