package com.shawn.middle.controller;
import com.shawn.middle.entity.Vm;
import com.shawn.middle.entity.VmDto;
import com.shawn.middle.entity.VmResponse;
import com.shawn.middle.mapper.Vmmapper;
import com.shawn.middle.service.VmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class VmController {
    @Autowired
    private Vmmapper vmmapper;

    /**
     * find all vms maybe used in the futuer
     * @return
     */
    @GetMapping("/getall")
    public List<Vm> getVms(){
        List<Vm> vmList = vmmapper.selectAllVms();
        return vmList;
    }


    private final VmService vmService;

    public VmController(VmService vmService) {
        this.vmService = vmService;
    }

    @GetMapping("/find_vms")
    public List<VmDto> findVmsFromDatabase(@RequestParam(required = false) String cpu,
                                           @RequestParam(required = false) String memory,
                                           @RequestParam(required = false) String csp) {
        return vmService.findVmsFromDatabase(cpu, memory, csp);
    }

    @PostMapping("/vms")
    public VmResponse createFinalVmsList(@RequestBody List<VmDto> initVmsList) {
        return vmService.createFinalVmsList(initVmsList);
    }






}

