package com.shawn.middle.controller;
import com.shawn.middle.entity.Vm;
import com.shawn.middle.entity.VmDto;
import com.shawn.middle.entity.VmResponse;
import com.shawn.middle.mapper.Vmmapper;
import com.shawn.middle.service.VmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class VmController {
    @Autowired
    private Vmmapper vmmapper;

    /**
     * find all vms maybe used in the futuer
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

    @GetMapping("/operational_cost")
    public ResponseEntity<Map<String, Object>> getOperationalCost() {
        Map<String, Object> result = vmService.computeOperationalCost();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/network_cost")
    public ResponseEntity<Map<String, Object>> getNetworkCost() {
        Map<String, Object> result = vmService.computeNetworkCost();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/cost")
    public ResponseEntity<Map<String, Object>> getCost() {
        Map<String, Object> result = vmService.computeCost();
        return ResponseEntity.ok(result);
    }


}

