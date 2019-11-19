package com.drisko.dumi.controller.word;

import com.drisko.dumi.model.Prefix;
import com.drisko.dumi.model.Word;
import com.drisko.dumi.service.word.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/words")
public class WordController {

    private final WordService wordService;

    @Autowired
    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

    @GetMapping
    public List<Word> getAll() {
        return wordService.getAll();
    }

    @GetMapping("/{prefixId}")
    @ResponseBody
    public List<Word> getAllByPrefixId(@PathVariable int rootId) {
        return wordService.getAllByPrefixId(rootId);
    }

    @GetMapping("/load-levels")
    @ResponseBody
    public Map<Prefix,List<Word>> loadLevels(){
        return wordService.loadLevels();
    }
}
