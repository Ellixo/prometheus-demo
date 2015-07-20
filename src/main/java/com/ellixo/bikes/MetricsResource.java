package com.ellixo.bikes;

import com.ellixo.bikes.domain.Response;
import com.ellixo.bikes.domain.Station;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/metrics")
public class MetricsResource {

    @RequestMapping(method = RequestMethod.GET, produces={"text/plain"})
    public ResponseEntity<String> get() {
        RestTemplate restTemplate = new RestTemplate();
        Response response = restTemplate.getForObject("http://data.keolis-rennes.com/json/?version=2.0&key=KEY_API&cmd=getbikestations", Response.class);

        StringBuilder metricsBuilder = new StringBuilder();
        for (Station station : response.getOpendata().getAnswer().getData().getStations()) {
            metricsBuilder.append("bikes_available{station=\"" + station.getName() + "\"} " + station.getBikesavailable() +"\n");
            metricsBuilder.append("slots_available{station=\"" + station.getName() + "\"} " + station.getSlotsavailable() +"\n");
        }

        return new ResponseEntity<>(metricsBuilder.toString(), HttpStatus.OK);
    }

}
