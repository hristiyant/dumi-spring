package com.drisko.dumi.controller.game;

import com.drisko.dumi.model.Prefix;
import com.drisko.dumi.service.prefix.PrefixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/game")
public class GameController {

    private final PrefixService prefixService;

    @Autowired
    public GameController(PrefixService prefixService) {
        this.prefixService = prefixService;
    }

    @GetMapping("/load-levels")
    public Set<Prefix> getLevelsData() {
        return prefixService.getLevelsData();
    }
}
