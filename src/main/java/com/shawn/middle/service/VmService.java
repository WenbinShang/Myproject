package com.shawn.middle.service;

import com.shawn.middle.entity.VmDto;
import com.shawn.middle.entity.VmResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import java.util.List;

@Service
public class VmService {

    private final RestTemplate restTemplate;

    // 使用构造器注入
    public VmService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<VmDto> findVmsFromDatabase(String cpu, String memory, String csp) {
        String pythonApiUrl = "http://localhost:8000/find_vms"; // 替换为你的Python API的地址

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(pythonApiUrl)
                .queryParam("cpu", cpu)
                .queryParam("memory", memory)
                .queryParam("csp", csp);

        return restTemplate.getForObject(builder.toUriString(), List.class);
    }

    public VmResponse createFinalVmsList(List<VmDto> initVmsList) {
        String pythonApiUrl = "http://localhost:8000/vms"; // 替换为你的Python API的地址

        return restTemplate.postForObject(pythonApiUrl, initVmsList, VmResponse.class);
    }
}
