package com.jiedong.stockserver.restful;

import com.jiedong.stockserver.dto.StockInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/stockbasic")
public class StockBasicController {

    @GetMapping(produces = {"application/json"})
    public StockInfo getAll(@RequestParam Map<String, Object> params) {
        StockInfo stockInfo = new StockInfo();
        stockInfo.setCode("sz00086");
        stockInfo.setName("南极电商");
        return stockInfo;
    }
}